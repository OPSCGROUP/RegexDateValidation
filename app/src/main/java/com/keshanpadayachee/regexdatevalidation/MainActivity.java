package com.keshanpadayachee.regexdatevalidation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {

    private EditText edtDate1;
    private Button btnCheck1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtDate1 = findViewById(R.id.edtDate);
        btnCheck1 = findViewById(R.id.btnCheck1);

        btnCheck1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String inputDate = edtDate1.getText().toString();

                // Code Attribution
                // HowToDoInJava
                // Last Updated 25th January 2022
                // Accessed 13th April 2022
                // URL: https://howtodoinjava.com/java/regex/java-regex-date-format-validation/

                String regex = "^(3[01]|[12][0-9]|0[1-9])/(1[0-2]|0[1-9])/[0-9]{4}$";

                Pattern pattern = Pattern.compile(regex);

                Matcher checkMatch = pattern.matcher(inputDate);
                if (checkMatch.matches()) {
                    Toast.makeText(MainActivity.this, inputDate + " is VALID", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, inputDate + " is INVALID", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}