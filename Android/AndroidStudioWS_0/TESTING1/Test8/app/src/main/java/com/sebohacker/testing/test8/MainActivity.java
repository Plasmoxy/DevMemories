package com.sebohacker.testing.test8;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button bt = (Button) findViewById(R.id.button);
        final Button fs = (Button) findViewById(R.id.buttonFS);
        final TextView tw = (TextView) findViewById(R.id.textView);

        final Intent myIntent = new Intent(MainActivity.this, FullscreenActivity.class);

        fs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.this.startActivity(myIntent);
            }
        });

        final String[] frases = {"CUUUS", "AHOJ", "JEST TO ANDROID", "FAJNY CHLEB", "DAS IST COOL !!!", "JUUUUJ"};
        final Random random = new Random();
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                while (true) {
                    int rand = random.nextInt(5);
                    if (!(tw.getText().toString().equals(frases[rand]))) {
                        tw.setText(frases[rand]);
                        break;
                    }
                }
            }
        });
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
        if (id == R.id.action_exit) {
            try {
                this.finish();
            } catch(Throwable e) {
                Log.println(100, "INSIDEINFO", e.getMessage());
            }
        }
        if (id == R.id.action_hello) {
            Toast tst = Toast.makeText(getApplicationContext(), "HELLOOOOO !!!", Toast.LENGTH_SHORT);
            tst.show();
        }

        return super.onOptionsItemSelected(item);
    }
}
