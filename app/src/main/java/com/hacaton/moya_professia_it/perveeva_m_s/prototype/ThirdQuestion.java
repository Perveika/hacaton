package com.hacaton.moya_professia_it.perveeva_m_s.prototype;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ThirdQuestion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_question);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button correct = findViewById(R.id.correct);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button wron = findViewById(R.id.wron);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button wron2 = findViewById(R.id.wrong);
        correct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showFacts("Верно! Дама сдавала в багаж диван, чемодан, саквояж");
            }
        });

        wron.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showWrongs("Ошибочка! Дама не сдавала в багаж шляпу");
            }
        });
        wron2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showWrongs("Ошибочка! Дама не сдавала в багаж иконку");
            }
        });
    }
    public void showFacts(String text) {
        AlertDialog.Builder builder = new AlertDialog.Builder(ThirdQuestion.this);
        builder.setMessage(text)
                .setCancelable(false)
                .setPositiveButton("Далее", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent = new Intent(getApplicationContext(), Results.class);
                        startActivity(intent);
                    }
                });
        AlertDialog dialog = builder.create();
        dialog.show();
    }

    public void showWrongs(String text) {
        AlertDialog.Builder builder = new AlertDialog.Builder(ThirdQuestion.this);
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