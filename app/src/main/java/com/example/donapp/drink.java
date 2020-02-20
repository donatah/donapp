package com.example.donapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.AssetManager;
import android.os.Bundle;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;

public class drink extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink);
        TextView textView = findViewById(R.id.textView3);
        AssetManager assetManager = getAssets();
        InputStream files;
        {
            try {
                files = assetManager.open("DON.c");
            } catch (IOException e) {
                e.printStackTrace();
            }
            textView.setText((CharSequence) files);

        }
    }
}
