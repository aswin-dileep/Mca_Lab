package com.example.addnumber;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button addButton;
    EditText num1EditText, num2EditText;
    TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize views
        num1EditText = findViewById(R.id.num1);
        num2EditText = findViewById(R.id.num2);
        resultTextView = findViewById(R.id.result);
        addButton = findViewById(R.id.addB);

        addButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        // Get the numbers from the EditTexts
        String num1String = num1EditText.getText().toString();
        String num2String = num2EditText.getText().toString();

        // Convert the strings to integers
        int num1 = Integer.parseInt(num1String);
        int num2 = Integer.parseInt(num2String);

        // Add the numbers
        int sum = num1 + num2;

        // Display the result
        resultTextView.setText("Result of Addition = " + sum);
    }
}

