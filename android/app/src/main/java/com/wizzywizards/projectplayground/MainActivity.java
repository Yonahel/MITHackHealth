package com.wizzywizards.projectplayground;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.ListViewCompat;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import com.gimbal.android.Gimbal;
import com.gimbal.logging.GimbalLogConfig;
import com.gimbal.logging.GimbalLogLevel;
import com.urbanairship.UAirship;

public class MainActivity extends AppCompatActivity
{
    public static String TAG = MainActivity.class.getSimpleName();

    private DrawerLayout drawers;
    private ListView drawerList;
    private EditText emailField;
    private EditText passField;
    private Button loginBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /* LOGIN/PASSWORD */
        emailField = (EditText) findViewById(R.id.email_field);
        passField = (EditText) findViewById(R.id.pass_field);

        /*
        * ****************
            GIMBAL
         * ***************
         *
        */
        Log.d(TAG, "Setting Gimbal API key");
        Gimbal.setApiKey((Application) UAirship.getApplicationContext(), "f9e09c0c-6c1c-4e88-81a2-b1f2c96157ad");

        //just for fun
        GimbalLogConfig.setLogLevel(GimbalLogLevel.DEBUG);

        Log.d(TAG, "Starting Gimbal listening");
        GimbalAdapter.shared().start();

    }

    public void onLoginClick(View view)
    {
        Log.d(TAG, "Login clicked");
        Intent homeIntent = new Intent(this, HomeActivity.class);
        startActivity(homeIntent);
    }
}
