package com.cunninglabs.templates.roboguice.singlefragmentactivitytemplate;

import com.cunninglabs.extensions.roboguice.activity.event.OnCreateOptionsMenu;
import com.cunninglabs.extensions.roboguice.activity.event.OnOptionsItemSelected;
import com.google.inject.Inject;
import roboguice.event.Observes;

public class Menu
{
    @Inject
    public Menu()
    {
    }

    public void WhenCreated(@Observes OnCreateOptionsMenu onCreateOptionsMenu)
    {
        onCreateOptionsMenu.inflate(R.menu.get);
    }

    public void WhenSelected(@Observes OnOptionsItemSelected onOptionsItemSelected)
    {
        int id = onOptionsItemSelected.getItem().getItemId();
        if (id == R.id.action_settings)
        {
            //Do something!
        }
    }
}
