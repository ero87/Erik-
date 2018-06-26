package com.example.ero.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main2ActivitySecond extends AppCompatActivity {
    public static final String SECOND_KEY = "SecondKey";

    private EditText editText1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2_second);
        editText1 = findViewById(R.id.edit1);

        String value = getIntent().getExtras().getString(MainActivity.KEY);
        editText1.setText(value);


        Button button1 = findViewById(R.id.button1);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText1.getText();
                Intent intent = new Intent(Main2ActivitySecond.this,MainActivity.class);
                intent.putExtra(SECOND_KEY,editText1.getText().toString());
                startActivity(intent);
            }
        });
    }
}