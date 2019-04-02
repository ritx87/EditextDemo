package com.ritesh.editextdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {
    MaterialButton inputTextLayout_Btn,normalEditText_Btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inputTextLayout_Btn = findViewById(R.id.inputTextLayout_Btn);
        normalEditText_Btn = findViewById(R.id.normalEditText_Btn);

        inputTextLayout_Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MaterialEditText.class);
                startActivity(intent);
            }
        });
    }
}
