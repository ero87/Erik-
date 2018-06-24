package com.example.student.week1_lesson2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnCreateContextMenuListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public  static final  String MY_KEY = "MyKey";

    private ImageView imageView;
    private TextView helloText;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        helloText = (TextView) findViewById(R.id.helloText);
        final CheckBox checkBox = (CheckBox) findViewById(R.id.atttt);
        editText = (EditText) findViewById(R.id.editText);
        imageView = (ImageView) findViewById(R.id.art);
        final Button saveButton = (Button) findViewById(R.id.saveButton);
        final Button chenButton = (Button) findViewById(R.id.chenButton);

        method(checkBox.isChecked());

        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //        Toast.makeText(MainActivity.this, "Clicked", Toast.LENGTH_LONG).show();
                //  final String editTextValue = editText.getText().toString();
                //helloText.setText(editTextValue);
                helloText.append(editText.getText());
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra(MY_KEY, editText.getText().toString());
                //startActivity(intent);
               startActivityForResult(intent,11);
            }
        });
       chenButton.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               imageView.setImageResource(R.drawable.a12);

           }
       });
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                method(b);
            }
        });
    }

    private void method(boolean isChecked) {
        if (isChecked) {
            imageView.setVisibility(View.VISIBLE);
        } else {
            imageView.setVisibility(View.INVISIBLE);
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(resultCode == RESULT_OK){
            if(requestCode == 11 && data != null){
                String strMassage = data.getStringExtra("keyName");
                helloText.setText(strMassage);
            }
        }
    }
}
