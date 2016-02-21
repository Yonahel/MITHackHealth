package com.wizzywizards.projectplayground;

import android.app.Activity;
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


    }

    public void onLoginClick(View view)
    {
        Log.d(TAG, "Login clicked");
        Intent homeIntent = new Intent(this, HomeActivity.class);
        startActivity(homeIntent);
    }
}
