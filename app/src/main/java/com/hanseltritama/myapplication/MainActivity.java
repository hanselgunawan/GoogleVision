package com.hanseltritama.myapplication;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EmojifyButtonFragment emojifyButtonFragment = new EmojifyButtonFragment();

        emojifyButtonFragment.setBtnText("Emojify Me!");

        FragmentManager fragmentManager = getSupportFragmentManager();

        fragmentManager.beginTransaction()
                .add(R.id.emojify_me_btn, emojifyButtonFragment)
                .commit();

    }
}
