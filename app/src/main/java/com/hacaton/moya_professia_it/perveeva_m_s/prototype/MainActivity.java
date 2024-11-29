package com.hacaton.moya_professia_it.perveeva_m_s.prototype;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openSettings(View v) {
        Intent intent = new Intent(this, Settings.class);
        startActivity(intent);
    }
    public void choosingLiterators(View v) {
        Intent intent = new Intent(this, Choosing.class);
        startActivity(intent);
    }

}