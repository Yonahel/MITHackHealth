package com.wizzywizards.projectplayground;

import android.app.Application;

import com.urbanairship.UAirship;

/**
 * Created by kiks on 2/21/2016.
 */
public class UrbanTakeoff extends Application
{
    @Override
    public void onCreate()
    {
        super.onCreate();

        UAirship.takeOff(this, new UAirship.OnReadyCallback()
        {
            @Override
            public void onAirshipReady(UAirship uAirship)
            {
                uAirship.getPushManager().setUserNotificationsEnabled(true);

            }
        });

    }
}
