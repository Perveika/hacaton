package com.hacaton.moya_professia_it.perveeva_m_s.prototype.info;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.hacaton.moya_professia_it.perveeva_m_s.prototype.Choosing;
import com.hacaton.moya_professia_it.perveeva_m_s.prototype.MainActivity;
import com.hacaton.moya_professia_it.perveeva_m_s.prototype.R;
import com.hacaton.moya_professia_it.perveeva_m_s.prototype.StartPlay;

public class Marshak extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_marshak);

    }
    public void goBackChoosing(View v) {
        Intent intent = new Intent(this, Choosing.class);
        startActivity(intent);
    }
    public void startPlay(View v) {
        Intent intent = new Intent(this, StartPlay.class);
        startActivity(intent);
    }

}