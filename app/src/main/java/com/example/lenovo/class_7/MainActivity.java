package com.example.lenovo.class_7;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText editTextValueOfA;
    private EditText editTextValueOfB;
    private TextView textViewResult;

    public MainActivity() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextValueOfA = findViewById(R.id.edittext_valueA);
        editTextValueOfB = findViewById(R.id.edittext_valueB);
        textViewResult = findViewById(R.id.textview_result);
        Toast.makeText(this, "OnCreate Executed", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "onStarted executed", Toast.LENGTH_SHORT).show();
    }

   /* @Override
    protected void onPostResume() {
        super.onPostResume();

        Toast.makeText(this, "0nResume executed", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "onPause executed", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();

        Toast.makeText(this, "onStop executed", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Toast.makeText(this, "onDestroy executed", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Toast.makeText(this, "onRestart executed", Toast.LENGTH_SHORT).show();
    } */


    public void calculate(View view) {

        int valueA = Integer.parseInt(editTextValueOfA.getText().toString());
        int valueB = Integer.parseInt(editTextValueOfB.getText().toString());

        int result = 0;

        switch (view.getId()) {
            case R.id.button_add:
                result = valueA + valueB;

                break;

            case R.id.button_sub:
                result = valueA - valueB;
                break;

            case R.id.button_mul:
                result = valueA * valueB;
                break;

            case R.id.button_div:
                result = valueA / valueB;

                break;
        }

        textViewResult.setText(String.valueOf(result));

    }
}
