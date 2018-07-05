package com.sebohacker.testing.sockettest1;

import android.app.Activity;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * Created by DELL-ENGLISH-SP on 22. 8. 2015.
 */
public class SocketSend0 extends AsyncTask<String, Integer, Integer> {
    Context mContext;
    Activity mActivity;

    public SocketSend0(Activity activity, Context context) {
        super();
        mContext = context;
        mActivity = activity;
    }

    public void toastOnUI(final String text) {
        mActivity.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                Toast toast = Toast.makeText(mContext, text, Toast.LENGTH_SHORT);
                toast.show();
            }
        });
    }

    @Override
    protected Integer doInBackground(String... params) { //params : (String address, port, data)
        try {
            Socket client = new Socket(params[0], Integer.valueOf(params[1]));
            DataOutputStream out = new DataOutputStream(client.getOutputStream());
            out.writeByte(Integer.parseInt(params[2]));
            out.close();
        } catch (UnknownHostException e) {
            toastOnUI("Error : Unknown Host [java.net.UnknownHostException]");
            return 0;
        } catch (IOException e) {
            toastOnUI("Error: IO error [java.io.IOException]\n(Probably no socket server is\nrunning on specified address)");
            return 0;
        }
        return 0;
    }
}