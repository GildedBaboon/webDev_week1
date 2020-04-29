package com.example.webdev_week1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG ="MainActivity";
    int count_increment = 0;
    int count_toast_1 = 0;
    int count_toast_2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //App 1 for Week 2
        final Button button_system_print = findViewById(R.id.button_system_print);

        button_system_print.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Log.i(TAG, "onClick: The button has been pressed");
            }
        });

        //App 2 for Week 2
        final Button button_increment = findViewById(R.id.button_increment);
        final TextView textView_increment = findViewById(R.id.textView_increment);

        button_increment.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                count_increment++;
                textView_increment.setText("Pressed: " + count_increment + "times");
            }
        });

        //App 3 for Week 2
        final Button button_getText = findViewById(R.id.button_getText);
        final TextView textView_getText = findViewById(R.id.textView_getText);
        final EditText editText_getText = findViewById(R.id.editText_getText);

        button_getText.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                textView_getText.setText(editText_getText.getText());
            }
        });

        //App 5 for Week 2
        final TextView textView_toast1 = findViewById(R.id.textView_toast1);
        final TextView textView_toast2 = findViewById(R.id.textView_toast2);

        View.OnClickListener toast_listener = new View.OnClickListener() {
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.textView_toast1:
                        count_toast_1++;
                        String temp_toast_1 = "Toast 1 pressed: " + count_toast_1;
                        Toast.makeText(getApplicationContext(), temp_toast_1, Toast.LENGTH_LONG).show();
                        break;
                    case R.id.textView_toast2:
                        count_toast_2++;
                        String temp_toast_2 = "Toast 2 pressed: " + count_toast_2;
                        Toast.makeText(getApplicationContext(), temp_toast_2, Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        };
        textView_toast1.setOnClickListener(toast_listener);
        textView_toast2.setOnClickListener(toast_listener);

    }
}