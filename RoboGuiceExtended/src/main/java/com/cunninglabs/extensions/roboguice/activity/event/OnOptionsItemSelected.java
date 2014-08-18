package com.cunninglabs.extensions.roboguice.activity.event;

import android.app.Activity;
import android.view.MenuItem;

/**
 * Class representing the event raised by RoboActivity.nOptionsItemSelected()
 * @author Matthew Cunningham
 * @author Adam Tybor
 * @author John Ericksen
 */
public class OnOptionsItemSelected
{
    protected Activity activity;
    private MenuItem item;

    public OnOptionsItemSelected(Activity activity, MenuItem item) {
        this.activity = activity;
        this.item = item;
    }

    public Activity getActivity() {
        return activity;
    }

    public MenuItem getItem()
    {
        return item;
    }
}
