package com.cunninglabs.templates.roboguice.singlefragmentactivitytemplate;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import roboguice.fragment.RoboFragment;

/**
* A placeholder fragment containing a simple view.
*/
public class Fragment extends RoboFragment
{
    public Fragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_template, container, false);
    }
}
