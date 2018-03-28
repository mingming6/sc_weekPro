package com.csii.dev.sc;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import tech.madp.core.Engine;


/**
 * Created by mingming on 2018/3/24.
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Engine.startup();
    }
}
