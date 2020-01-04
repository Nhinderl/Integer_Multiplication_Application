package com.example.testingapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button newB = (Button)findViewById(R.id.multiplyBtn);
        newB.setOnClickListener(new View.OnClickListener(){

            @Override
           public void onClick(View view){

                EditText num1 = (EditText)findViewById(R.id.firstNumberEditText);
                EditText num2 = (EditText)findViewById(R.id.secondNumberEditText);
                TextView resultTV = (TextView)findViewById(R.id.resultText);

                int number1 = Integer.parseInt(num1.getText().toString());
                int number2 = Integer.parseInt(num2.getText().toString());

                resultTV.setText((number1 * number2) + "");

           }

        });

    }
}
