package com.gyk2017.animasyonornegi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private CloudAnimation mCloudAnimation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mCloudAnimation = new CloudAnimation(this);
        setContentView(mCloudAnimation);
    }
}
