package com.sebohacker.testing.sockettest1;

import android.app.Activity;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Looper;
import android.provider.ContactsContract;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((Button) findViewById(R.id.button_A)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text_a = ((EditText) findViewById(R.id.A_byteEditText)).getText().toString();
                socketSend(text_a); //int !!! after
            }
        });
        ((Button) findViewById(R.id.button_B)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text_b = ((EditText) findViewById(R.id.B_byteEditText)).getText().toString();
                socketSend(text_b); //int !!! after
            }
        });
        ((Button) findViewById(R.id.button_tg)).setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                String text_a = ((EditText) findViewById(R.id.A_byteEditText)).getText().toString();
                String text_b = ((EditText) findViewById(R.id.B_byteEditText)).getText().toString();
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    socketSend(text_a);
                } else if (event.getAction() == MotionEvent.ACTION_UP) {
                    socketSend(text_b);
                }
                return true;
            }
        });
    }


    public void socketSend(String data) {
        String addr = ((EditText) findViewById(R.id.addressEditText)).getText().toString();
        String port = ((EditText) findViewById(R.id.portEditText)).getText().toString();
        new SocketSend0(this, getApplicationContext()).execute(addr, port, data);
    }

}