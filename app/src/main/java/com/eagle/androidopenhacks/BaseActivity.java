package com.eagle.androidopenhacks;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class BaseActivity extends AppCompatActivity{

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        Log.d(this.getLocalClassName(),"In onCreate Method");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(this.getLocalClassName(),"In onStart Method");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(this.getLocalClassName(),"In onResume Method");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(this.getLocalClassName(),"In onPause Method");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(this.getLocalClassName(),"In onStop Method");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(this.getLocalClassName(),"In onDestroy Method");
    }
}
