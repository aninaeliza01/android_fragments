package com.example.android_fragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void click(View view) {
        getSupportFragmentManager().beginTransaction().replace(R.id.fl1,new BlankFragment()).commit();    }

    public void click1(View view) {
        getSupportFragmentManager().beginTransaction().replace(R.id.fl1,new BlankFragment2()).commit();
    }
}