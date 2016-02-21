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

import com.wizzywizards.projectplayground.adapter.KidsListArrayAdapter;

public class IncentivesActivity extends AppCompatActivity
{
    public static String TAG = IncentivesActivity.class.getSimpleName();

    private DrawerLayout drawers;
    private ListView drawerList;
    private ListView incentivesList;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_incentives);

        /* NAVIGATION DRAWER */
        String[] menuItems = {"My Kids", "My Activities", "Incentives"};
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

        incentivesList = (ListView) findViewById(R.id.incentives_list);
        String[] kids = {"$1.00 off Fresh Produce", "10% off Salad Kit"};

        incentivesList.setAdapter(new KidsListArrayAdapter(this, kids));
        incentivesList.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                Log.d(TAG, "Kid clicked");
            }
        });


    }
}
