package com.cunninglabs.templates.roboguice.singlefragmentactivitytemplate;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import com.cunninglabs.extensions.roboguice.activity.CunningRoboFragmentActivity;
import com.google.inject.Inject;
import roboguice.inject.ContentView;

@ContentView(R.layout.activity_template)
public class Activity extends CunningRoboFragmentActivity
{
    @Inject Fragment fragment;
    @Inject FragmentManager fragmentManager;
    @Inject Menu menu;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null)
        {
            fragmentManager
                    .beginTransaction()
                    .add(R.id.container, fragment)
                    .commit();
        }
    }
}
