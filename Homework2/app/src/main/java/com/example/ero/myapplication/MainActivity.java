package com.example.ero.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String KEY = "key";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText editText = findViewById(R.id.editText);
        final Button button = findViewById(R.id.ClishButton);

        try {
            String value1 = getIntent().getExtras().getString(Main2ActivitySecond.SECOND_KEY);
            editText.setText(value1);
        }catch (NullPointerException e){
            editText.getText();
        }

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.getText();
                Intent intent = new Intent(MainActivity.this,Main2ActivitySecond.class);
                intent.putExtra(KEY,editText.getText().toString());
                startActivity(intent);

            }
        });
    }

}
