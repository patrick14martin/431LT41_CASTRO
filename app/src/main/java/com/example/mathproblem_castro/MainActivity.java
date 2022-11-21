package com.example.mathproblem_castro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;




public class MainActivity extends AppCompatActivity {
    Integer val1,val2,val3,add1;
    EditText first,second,third;



    public void sum(View v) {

        first = findViewById(R.id.etNumber1);
        second = findViewById(R.id.etNumber2);
        third = findViewById(R.id.etNumber3);

        Button add = findViewById(R.id.button1);

            String a = first.getText().toString();
            String b = second.getText().toString();
            String c = third.getText().toString();
            if (first.getText().toString().isEmpty() || second.getText().toString().isEmpty() || third.getText().toString().isEmpty()) {
                val1 = 0;
                val2 = 0;
                val3 = 0;
            } else {
                val1 = Integer.parseInt(a);
                val2 = Integer.parseInt(b);
                val3 = Integer.parseInt(c);
            }
            add1 = val1 + val2 + val3;
        String resultMessage = String.valueOf(add1);
        Bundle args = new Bundle();
        args.putString("result", resultMessage);
        DialogFragmentCustom dialogFragmentImp = new DialogFragmentCustom();
        dialogFragmentImp.setArguments(args);
        dialogFragmentImp.show(getSupportFragmentManager(),"Display Result");
        clearEditText();





    }
    public void difference(View v){

        first = findViewById(R.id.etNumber1);
        second = findViewById(R.id.etNumber2);
        third = findViewById(R.id.etNumber3);
        Button add2 = findViewById(R.id.button2);
        String a = first.getText().toString();
        String b = second.getText().toString();
        String c = third.getText().toString();
        if (first.getText().toString().isEmpty() || second.getText().toString().isEmpty() || third.getText().toString().isEmpty()) {
            val1 = 0;
            val2 = 0;
            val3 = 0;
        } else {
            val1 = Integer.parseInt(a);
            val2 = Integer.parseInt(b);
            val3 = Integer.parseInt(c);
        }
         add1 = val1 - val2 - val3;
        String resultMessage = String.valueOf(add1);
        Bundle args = new Bundle();
        args.putString("result", resultMessage);
        DialogFragmentCustom dialogFragmentImp = new DialogFragmentCustom();
        dialogFragmentImp.setArguments(args);
        dialogFragmentImp.show(getSupportFragmentManager(),"Display Result");
        clearEditText();

    }
    public void product(View v){
        first = findViewById(R.id.etNumber1);
        second = findViewById(R.id.etNumber2);
        third = findViewById(R.id.etNumber3);
        Button add3 = findViewById(R.id.button3);
        String a = first.getText().toString();
        String b = second.getText().toString();
        String c = third.getText().toString();
        if (first.getText().toString().isEmpty() || second.getText().toString().isEmpty() || third.getText().toString().isEmpty()) {
            val1 = 0;
            val2 = 0;
            val3 = 0;
        } else {
            val1 = Integer.parseInt(a);
            val2 = Integer.parseInt(b);
            val3 = Integer.parseInt(c);
        }
         add1 = val1 * val2 * val3;
        String resultMessage = String.valueOf(add1);
        Bundle args = new Bundle();
        args.putString("result", resultMessage);
        DialogFragmentCustom dialogFragmentImp = new DialogFragmentCustom();
        dialogFragmentImp.setArguments(args);
        dialogFragmentImp.show(getSupportFragmentManager(),"Display Result");
        clearEditText();

    }
    public void quotient(View v){
        first = findViewById(R.id.etNumber1);
        second = findViewById(R.id.etNumber2);
        third = findViewById(R.id.etNumber3);
        Button add4 = findViewById(R.id.button4);
        String a = first.getText().toString();
        String b = second.getText().toString();
        String c = third.getText().toString();
        if (first.getText().toString().isEmpty() || second.getText().toString().isEmpty() || third.getText().toString().isEmpty()) {
            val1 = 0;
            val2 = 0;
            val3 = 0;
        } else {
            val1 = Integer.parseInt(a);
            val2 = Integer.parseInt(b);
            val3 = Integer.parseInt(c);
        }
        add1 = val1 / val2 / val3;
        String resultMessage = String.valueOf(add1);
        Bundle args = new Bundle();
        args.putString("result", resultMessage);
        DialogFragmentCustom dialogFragmentImp = new DialogFragmentCustom();
        dialogFragmentImp.setArguments(args);
        dialogFragmentImp.show(getSupportFragmentManager(),"Display Result");
        clearEditText();
    }
    public void clearEditText(){
        first.getText().clear();
        second.getText().clear();
        third.getText().clear();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}