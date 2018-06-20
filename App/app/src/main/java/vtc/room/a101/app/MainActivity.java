package vtc.room.a101.app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button levon;
    private Button ero;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        levon = (Button) findViewById(R.id.button1);
        levon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, R.string.levon, Toast.LENGTH_LONG).show();
            }
        });
        ero = (Button) findViewById(R.id.button2);
        ero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, R.string.erik, Toast.LENGTH_SHORT).show();
            }
        });
    }



}
