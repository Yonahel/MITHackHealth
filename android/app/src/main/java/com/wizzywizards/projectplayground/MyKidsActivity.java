package com.wizzywizards.projectplayground;

import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.wizzywizards.projectplayground.adapter.KidsListArrayAdapter;

public class MyKidsActivity extends AppCompatActivity
{
    public static String TAG = MyKidsActivity.class.getSimpleName();

    private DrawerLayout drawers;
    private ListView drawerList;

    private ListView kidsList;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_kids);

        /* NAVIGATION DRAWER */
        String[] menuItems = {"My Kids", "My Activities"};
        drawers = (DrawerLayout) findViewById(R.id.nav_drawer);
        drawerList = (ListView) findViewById(R.id.left_drawer);
        drawerList.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,menuItems));
        drawerList.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                Log.d(TAG, "Item clicked");
            }
        });

        kidsList = (ListView) findViewById(R.id.kids_list);
        String[] kids = {"Timmy", "Jimmy", "Kimmy"};

        kidsList.setAdapter(new KidsListArrayAdapter(this, kids));
        kidsList.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                Log.d(TAG, "Kid clicked");
            }
        });



    }
}
