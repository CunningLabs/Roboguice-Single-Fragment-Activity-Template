package com.cunninglabs.extensions.roboguice.activity.event;

import android.app.Activity;
import android.view.Menu;

/**
 * Class representing the event raised by RoboActivity.nOptionsItemSelected()
 * @author Matthew Cunningham
 * @author Adam Tybor
 * @author John Ericksen
 */
public class OnCreateOptionsMenu
{
    protected Activity activity;
    private Menu menu;

    public OnCreateOptionsMenu(Activity activity, Menu menu) {
        this.activity = activity;
        this.menu = menu;
    }

    public void inflate(int id)
    {
        activity.getMenuInflater().inflate(id, menu);
    }
}
