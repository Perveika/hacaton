package com.hacaton.moya_professia_it.perveeva_m_s.prototype;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Switch;

public class Settings extends AppCompatActivity {

    //Switch zvuk;
    private MediaPlayer fon_sound;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
//        zvuk = findViewById(R.id.zvuk);
//        MediaPlayer.create(this, R.raw.fon);
//        zvuk.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                soundPlay(fon_sound);
//            }
//        });
    }
    public void goBack(View v) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
//    private void soundPlay(MediaPlayer sound) {
//        if (zvuk.isChecked()) {
//            sound.stop();
//        } else {
//            sound.start();
//        }
//
//    }
}