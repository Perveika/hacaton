package com.hacaton.moya_professia_it.perveeva_m_s.prototype;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.hacaton.moya_professia_it.perveeva_m_s.prototype.info.Bunin;
import com.hacaton.moya_professia_it.perveeva_m_s.prototype.info.Marshak;

public class Choosing extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choosing);
    }

    public void goBackMenu(View v) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void toBuninInfo(View v) {
        Intent intent = new Intent(this, Bunin.class);
        startActivity(intent);
    }

    public void toMarshakInfo(View v) {
        Intent intent = new Intent(this, Marshak.class);
        startActivity(intent);
    }

}