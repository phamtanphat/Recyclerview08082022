package com.example.recyclerview08082022;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setCategory(CategoryEnum.FAMILY);
    }

    private void setCategory(CategoryEnum category) {

    }
}