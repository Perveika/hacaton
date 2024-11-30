package com.hacaton.moya_professia_it.perveeva_m_s.prototype;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.DatePickerDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.hacaton.moya_professia_it.perveeva_m_s.prototype.info.Marshak;

public class StartPlay extends AppCompatActivity {
    Button dop_info;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_play);
        dop_info = findViewById(R.id.dopInfo);
        dop_info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showFact("Всего в Воронеже около 22 памятников, половина из которых посвящена литературным деятелям нашего города");
            }
        });
    }
    public void showFact(String text) {
        AlertDialog.Builder builder = new AlertDialog.Builder(StartPlay.this);
        builder.setMessage(text)

                .setPositiveButton("Понятно", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        AlertDialog dialog = builder.create();
        dialog.show();
    }
    public void goBackMarshak(View v) {
        Intent intent = new Intent(this, Marshak.class);
        startActivity(intent);
    }
    public void toQuestions(View v) {
        Intent intent = new Intent(this, play.class);
        startActivity(intent);
    }
}