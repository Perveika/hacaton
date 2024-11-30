package com.hacaton.moya_professia_it.perveeva_m_s.prototype;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public class Results extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);
    }
    public void goBackHome(View v) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}