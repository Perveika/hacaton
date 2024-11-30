package com.hacaton.moya_professia_it.perveeva_m_s.prototype;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class play extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);
        Button child = findViewById(R.id.child);
        Button adults = findViewById(R.id.adults);
        Button all = findViewById(R.id.all);
        child.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showFact("Верно! В основном Маршак писал сказки и стихи именно для детей.");
            }
        });

        adults.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showWrong("Ошибочка! Основное творчество Маршака адресовалось кому-то другому");
            }
        });
        all.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showWrong("Ошибочка! Маршак действительно писал и для детей, и для взрослых, но есть определенная аудитория, которой он посвятил большую часть своих произведений");
            }
        });
    }
    public void showFact(String text) {
        AlertDialog.Builder builder = new AlertDialog.Builder(play.this);
        builder.setMessage(text)
                .setCancelable(false)
                .setPositiveButton("Далее", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent intent = new Intent(getApplicationContext(), SecondQuestion.class);
                startActivity(intent);
            }
        });
        AlertDialog dialog = builder.create();
        dialog.show();
    }

    public void showWrong(String text) {
        AlertDialog.Builder builder = new AlertDialog.Builder(play.this);
        builder.setMessage(text)
                .setCancelable(false)
                .setPositiveButton("Попробовать еще раз", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
        AlertDialog dialog = builder.create();
        dialog.show();
    }

}