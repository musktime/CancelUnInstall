package com.musk.accessibility;

import android.app.Activity;
import android.os.Bundle;
import android.os.PersistableBundle;

import com.seclib.musk.Skipper;

/**
 * Created by musk on 17/12/21.
 */

public class TestActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState,PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        Skipper.turnToAccessibility(this);
    }
}
