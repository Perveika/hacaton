package com.hacaton.moya_professia_it.perveeva_m_s.prototype;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondQuestion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_question);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button month12 = findViewById(R.id.month12);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button wron1 = findViewById(R.id.wron1);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button wron2 = findViewById(R.id.wron2);
        month12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showFacts("Верно! Двенадцать месяцев помогли главной героине достать подснежники, которые были ей очень нужны");
            }
        });

        wron1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showWrongs("Ошибочка! Такого произведения у Маршака нет");
            }
        });
        wron2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showWrongs("Ошибочка! Это произведение Маршака не про подснежники");
            }
        });
    }
    public void showFacts(String text) {
        AlertDialog.Builder builder = new AlertDialog.Builder(SecondQuestion.this);
        builder.setMessage(text)
                .setCancelable(false)
                .setPositiveButton("Далее", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent = new Intent(getApplicationContext(), ThirdQuestion.class);
                        startActivity(intent);
                    }
                });
        AlertDialog dialog = builder.create();
        dialog.show();
    }

    public void showWrongs(String text) {
        AlertDialog.Builder builder = new AlertDialog.Builder(SecondQuestion.this);
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