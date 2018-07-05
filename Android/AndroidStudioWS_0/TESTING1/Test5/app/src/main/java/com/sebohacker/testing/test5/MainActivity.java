package com.sebohacker.testing.test5;

import android.app.Activity;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends Activity implements SensorEventListener {

    private SensorManager sManager;
    private float xCh, yCh, zCh = 0;
    private float x, y, z = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sManager = (SensorManager) getSystemService(SENSOR_SERVICE);

        ((Button) findViewById(R.id.rButton)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int width = ((View) findViewById(R.id.platno)).getWidth();
                int height = ((View) findViewById(R.id.platno)).getHeight();
                Switch sw = (Switch) findViewById(R.id.switch1);

                sw.setLeft(width / 2);
                sw.setTop(height / 2);
            }
        });

    }

    @Override
    protected void onResume() {
        super.onResume();
        sManager.registerListener(this, sManager.getDefaultSensor(Sensor.TYPE_GYROSCOPE), SensorManager.SENSOR_DELAY_UI);
    }

    @Override
        protected void onStop() {
            sManager.unregisterListener(this);
        super.onStop();
    }

    public void onAccuracyChanged(Sensor arg0, int arg1) {
        // nothing
    }

    @Override
    public void onSensorChanged(SensorEvent event) {
        if (event.accuracy == SensorManager.SENSOR_STATUS_UNRELIABLE) return;

        Switch sw = (Switch) findViewById(R.id.switch1);

        xCh = event.values[0];//mapFloat(event.values[0], 0.1F, 3F, 1F, 100F);
        yCh = event.values[1];//mapFloat(event.values[1], 0.1F, 3F, 1F, 100F);
        zCh = event.values[2];//mapFloat(event.values[2], 0.1F, 3F, 1F, 100F);

        x += xCh;
        y += yCh;
        z += zCh;

        sw.setTop(sw.getTop() + (int)y);
        sw.setLeft(sw.getLeft() + (int)x);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public float mapFloat(float x, float in_min, float in_max, float out_min, float out_max) {
        return (x - in_min) * (out_max - out_min) / (in_max - in_min) + out_min;
    }
}
