package com.cunninglabs.extensions.roboguice.activity;

import android.view.Menu;
import android.view.MenuItem;
import com.cunninglabs.extensions.roboguice.activity.event.OnCreateOptionsMenu;
import com.cunninglabs.extensions.roboguice.activity.event.OnOptionsItemSelected;
import roboguice.activity.RoboActivity;

/**
 * Class extending Roboguice event types.
 * @author Matthew Cunningham
 */
public class CunningRoboActivity extends RoboActivity
{
    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        boolean result = super.onCreateOptionsMenu(menu);
        eventManager.fire(new OnCreateOptionsMenu(this, menu));
        return result;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        boolean result = super.onOptionsItemSelected(item);
        eventManager.fire(new OnOptionsItemSelected(this, item));
        return result;
    }
}
