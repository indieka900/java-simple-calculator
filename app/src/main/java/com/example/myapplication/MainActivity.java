package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText editTextFirstNo, editTextSecondNo;
    Button addButton;
    TextView textViewAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextFirstNo = findViewById(R.id.editText_first_no); // Corrected ID
        editTextSecondNo = findViewById(R.id.editText_second_no); // Corrected ID
        addButton = findViewById(R.id.button);
        textViewAnswer = findViewById(R.id.textView_answer);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get the numbers from EditText fields
                String firstNumberStr = editTextFirstNo.getText().toString();
                String secondNumberStr = editTextSecondNo.getText().toString();

                // Check if EditText fields are not empty
                if (!firstNumberStr.isEmpty() && !secondNumberStr.isEmpty()) {
                    // Parse the numbers from string to integer
                    int firstNumber = Integer.parseInt(firstNumberStr);
                    int secondNumber = Integer.parseInt(secondNumberStr);

                    // Perform addition
                    int result = firstNumber + secondNumber;

                    // Set the result to the TextView
                    textViewAnswer.setText(String.valueOf(result));
                }
            }
        });
    }
}
