package com.example.primeapp;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editText;
    private TextView resultTextView;
    private Button showResultButton;

    private String convertedCharacter = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);
        resultTextView = findViewById(R.id.resultTextView);
        showResultButton = findViewById(R.id.showResultButton);

        showResultButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showResult();
            }
        });
    }

    public void checkAndConvertCharacter(View view) {
        String inputString = editText.getText().toString();

        if (inputString.isEmpty()) {
            resultTextView.setText("Please enter a character.");
            return;
        }

        char inputChar = inputString.charAt(0);

        if (Character.isUpperCase(inputChar)) {
            char lowerChar = Character.toLowerCase(inputChar);
            inputString = lowerChar + inputString.substring(1);
            convertedCharacter = inputString;
            editText.setText(inputString);
            resultTextView.setText("Uppercase character converted to lowercase.");
        } else if (Character.isLowerCase(inputChar)) {
            char upperChar = Character.toUpperCase(inputChar);
            inputString = upperChar + inputString.substring(1);
            convertedCharacter = inputString;
            editText.setText(inputString);
            resultTextView.setText("Lowercase character converted to uppercase.");
        } else {
            resultTextView.setText("Input is not a valid character.");
        }
    }

    private void showResult() {
        if (convertedCharacter.isEmpty()) {
            resultTextView.setText("Please convert a character first.");
        } else {
            resultTextView.setText("Converted character: " + convertedCharacter);
        }
    }
}
