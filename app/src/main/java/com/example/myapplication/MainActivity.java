package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    Button button;
    RelativeLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.a);
        layout = findViewById(R.id.Relativela);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(layout,"This is first time to seeing android application"
                        ,Snackbar.LENGTH_INDEFINITE).setAction("No", new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                    }
                }).show();
            }
        });
    }
}