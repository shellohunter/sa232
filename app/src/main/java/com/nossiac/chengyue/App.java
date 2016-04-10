package com.nossiac.chengyue;

/**
 * Created by Administrator on 2016/4/10.
 */

import android.app.Application;
import android.os.SystemClock;
import android.util.Log;

import java.util.concurrent.TimeUnit;


public class App extends Application {
    final String TAG = "NossiacDebug";

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d(TAG, "onCreate: App.onCreate");
        // Don't do this! This is just so cold launches take some time
        SystemClock.sleep(TimeUnit.SECONDS.toMillis(3));
    }
}