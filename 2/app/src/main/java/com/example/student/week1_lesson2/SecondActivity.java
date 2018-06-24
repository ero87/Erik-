package com.example.student.week1_lesson2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    private EditText textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        String myValue = getIntent().getExtras().getString(MainActivity.MY_KEY);
        Toast.makeText(this, myValue, Toast.LENGTH_LONG).show();

        textView = (EditText) findViewById(R.id.secondText);
        textView.setText(myValue);
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent();
        intent.putExtra("keyName", textView.getText().toString());
        setResult(RESULT_OK, intent);
        finish();
    }

}
