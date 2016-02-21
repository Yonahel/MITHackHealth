package com.wizzywizards.projectplayground;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class HomeActivity extends AppCompatActivity
{
    public static String TAG = HomeActivity.class.getSimpleName();

    private DrawerLayout drawers;
    private ListView drawerList;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        /* NAVIGATION DRAWER */
        String[] menuItems = {"My Kids", "My Activities"};
        final Activity activity = this;
        drawers = (DrawerLayout) findViewById(R.id.nav_drawer);
        drawerList = (ListView) findViewById(R.id.left_drawer);
        drawerList.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,menuItems));
        drawerList.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                if(position == 0)
                {
                    Intent myKidsIntent = new Intent(activity, MyKidsActivity.class);
                    startActivity(myKidsIntent);
                }
            }
        });






    }
}
