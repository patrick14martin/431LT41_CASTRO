package com.example.mathproblem_castro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private TextView textout;

    public void sum(View v) {

        EditText first = findViewById(R.id.etNumber1);
        EditText second = findViewById(R.id.etNumber2);
        EditText third = findViewById(R.id.etNumber3);
        Button add = findViewById(R.id.button1);
        String a = first.getText().toString();
        String b = second.getText().toString();
        String c = third.getText().toString();
        Integer val1 = Integer.parseInt(a);
        Integer val2 = Integer.parseInt(b);
        Integer val3 = Integer.parseInt(c);
        Integer add1 = val1 + val2 + val3;
        String aw = String.valueOf(add1);
        textout = (TextView)findViewById(R.id.textView7);
        textout.setText(aw);


    }
    public void difference(View v){

        EditText first = findViewById(R.id.etNumber1);
        EditText second = findViewById(R.id.etNumber2);
        EditText third = findViewById(R.id.etNumber3);
        Button add2 = findViewById(R.id.button2);
        String a = first.getText().toString();
        String b = second.getText().toString();
        String c = third.getText().toString();
        Integer val1 = Integer.parseInt(a);
        Integer val2 = Integer.parseInt(b);
        Integer val3 = Integer.parseInt(c);
        Integer add1 = val1 - val2 - val3;
        String aw = String.valueOf(add1);
        textout = (TextView)findViewById(R.id.textView7);
        textout.setText(aw);

    }
    public void product(View v){
        EditText first = findViewById(R.id.etNumber1);
        EditText second = findViewById(R.id.etNumber2);
        EditText third = findViewById(R.id.etNumber3);
        Button add3 = findViewById(R.id.button3);
        String a = first.getText().toString();
        String b = second.getText().toString();
        String c = third.getText().toString();
        Integer val1 = Integer.parseInt(a);
        Integer val2 = Integer.parseInt(b);
        Integer val3 = Integer.parseInt(c);
        Integer add1 = val1 * val2 * val3;
        String aw = String.valueOf(add1);
        textout = (TextView)findViewById(R.id.textView7);
        textout.setText(aw);

    }
    public void quotient(View v){
        EditText first = findViewById(R.id.etNumber1);
        EditText second = findViewById(R.id.etNumber2);
        EditText third = findViewById(R.id.etNumber3);
        Button add4 = findViewById(R.id.button4);
        String a = first.getText().toString();
        String b = second.getText().toString();
        String c = third.getText().toString();
        Integer val1 = Integer.parseInt(a);
        Integer val2 = Integer.parseInt(b);
        Integer val3 = Integer.parseInt(c);
        Integer add1 = val1 / val2 / val3;
        String aw = String.valueOf(add1);
        textout = (TextView)findViewById(R.id.textView7);
        textout.setText(aw);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}