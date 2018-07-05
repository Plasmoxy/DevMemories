package com.sebohacker.testing.test4;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;

import org.w3c.dom.Text;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LOCKED);

        Button button_white = (Button) findViewById(R.id.button_white);
        Button button_black = (Button) findViewById(R.id.button_black);
        button_white.setOnClickListener(new View.OnClickListener() {@Override public void onClick(View v) { white(); }});
        button_black.setOnClickListener(new View.OnClickListener() {@Override public void onClick(View v) { black(); }});
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
            super.finish();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void white() {
        (findViewById(R.id.button_white)).setBackgroundResource(R.drawable.b_border_red);
        (findViewById(R.id.button_black)).setBackgroundResource(R.drawable.b_border_none);

        TextView text = (TextView) findViewById(R.id.text);
        text.setText("WHITE");
        text.setTextColor(Color.parseColor("#000000"));

        ((View) findViewById(R.id.mainLayout)).setBackgroundColor(Color.parseColor("#FFFFFF"));
    }

    public void black() {
        (findViewById(R.id.button_white)).setBackgroundResource(R.drawable.b_border_none);
        (findViewById(R.id.button_black)).setBackgroundResource(R.drawable.b_border_red);

        TextView text = (TextView) findViewById(R.id.text);
        text.setText("BLACK");
        text.setTextColor(Color.parseColor("#FFFFFF"));

        ((View) findViewById(R.id.mainLayout)).setBackgroundColor(Color.parseColor("#000000"));
    }

}
