package com.eagle.androidopenhacks;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;

public class HomeActivity extends BaseActivity{

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onPause() {
        super.onPause();
    }
}
