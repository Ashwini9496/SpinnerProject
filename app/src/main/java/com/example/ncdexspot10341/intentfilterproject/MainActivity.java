package com.example.ncdexspot10341.intentfilterproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.btn1);
        button.setOnClickListener(btnOnclickListener);
    }

    View.OnClickListener btnOnclickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent();
            intent.setAction("com.sample.intent");
            intent.addCategory(Intent.CATEGORY_DEFAULT);
            startActivity(intent);
        }
    };
}
