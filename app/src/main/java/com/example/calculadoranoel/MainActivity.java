package com.example.calculadoranoel;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText editText1, editText2;
    private TextView textViewResult;
    private String currentInput = "";
    private EditText currentEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        editText1 = findViewById(R.id.editTextNumberDecimal);
        editText2 = findViewById(R.id.editTextNumberDecimal2);
        textViewResult = findViewById(R.id.textView2);

        Button buttonSumar = findViewById(R.id.button12);
        Button buttonBorrar = findViewById(R.id.button13);


        editText1.setFocusableInTouchMode(true);
        editText2.setFocusableInTouchMode(true);

        setupNumericButtons();

        editText1.setOnClickListener(v -> setCurrentEditText(editText1));
        editText2.setOnClickListener(v -> setCurrentEditText(editText2));

        setCurrentEditText(editText1);

        buttonSumar.setOnClickListener(v -> {
            try {
                double num1 = Double.parseDouble(editText1.getText().toString());
                double num2 = Double.parseDouble(editText2.getText().toString());
                double result = num1 + num2;

                textViewResult.setText(String.valueOf(result));
            } catch (NumberFormatException e) {
                textViewResult.setText("Error: Ingrese números válidos");
            }
        });

        // Configurar botón "Borrar"
        buttonBorrar.setOnClickListener(v -> {
            if (currentEditText != null) {
                currentEditText.setText("");
            }
        });
    }

    private void setupNumericButtons() {
        int[] buttonIds = {
                R.id.button, R.id.button2, R.id.button3, R.id.button4,
                R.id.button5, R.id.button6, R.id.button7, R.id.button8,
                R.id.button9, R.id.button10
        };

        View.OnClickListener listener = v -> {
            Button button = (Button) v;
            String buttonText = button.getText().toString();

            if (currentEditText != null) {
                currentInput = currentEditText.getText().toString();
                currentEditText.setText(currentInput + buttonText);
            }
        };

        for (int id : buttonIds) {
            findViewById(id).setOnClickListener(listener);
        }
    }

    private void setCurrentEditText(EditText editText) {

        if (currentEditText != null) {
            currentEditText.setBackgroundResource(android.R.drawable.edit_text);
        }

        currentEditText = editText;
        currentInput = editText.getText().toString();

        currentEditText.setBackgroundResource(R.drawable.round); // Aquí puedes usar tu propio fondo

        currentEditText.requestFocus(); // Esto asegurará que el EditText se enfoque al hacer clic
    }
}
