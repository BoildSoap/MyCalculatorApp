package com.example.mycalculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int duration = Toast.LENGTH_LONG;
    CharSequence text = "Please Enter a Number";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void findSum(View view) {
        Context context = getApplicationContext();
        EditText number1ET = findViewById(R.id.textview_input1);
        EditText number2ET = findViewById(R.id.textview_input2);
        TextView numberSumTV = findViewById(R.id.output);
        if ((number1ET.getText().toString().equals("") ||  number2ET.getText().toString().equals(""))) {
            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        }else{
            double num1 = Integer.parseInt((number1ET.getText().toString()));
            double num2 = Integer.parseInt((number2ET.getText().toString()));
            double sum = num1 + num2;
            numberSumTV.setText("" + sum);
            }
        }


    public void findSub(View view) {
        Context context = getApplicationContext();
        EditText number1ET = findViewById(R.id.textview_input1);
        EditText number2ET = findViewById(R.id.textview_input2);
        TextView numberSumTV = findViewById(R.id.output);
        if((number1ET.getText().toString().equals("") ||  number2ET.getText().toString().equals(""))) {
            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        }
        else {
            double num1 = Integer.parseInt((number1ET.getText().toString()));
            double num2 = Integer.parseInt((number2ET.getText().toString()));
            double sub = num1 - num2;
            numberSumTV.setText("" + sub);
        }
    }

    public void findMult(View view) {
        Context context = getApplicationContext();
        EditText number1ET = findViewById(R.id.textview_input1);
        EditText number2ET = findViewById(R.id.textview_input2);
        TextView numberSumTV = findViewById(R.id.output);
        if(number1ET.getText().toString().equals("") ||  number2ET.getText().toString().equals("")) {
            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        }else {
            double num1 = Integer.parseInt((number1ET.getText().toString()));
            double num2 = Integer.parseInt((number2ET.getText().toString()));
            double mult = num1 * num2;
            numberSumTV.setText("" +Math.round(mult * 100.0) / 100.0);

        }
    }

    public void findDiv(View view) {
        Context context = getApplicationContext();
        EditText number1ET = findViewById(R.id.textview_input1);
        EditText number2ET = findViewById(R.id.textview_input2);
        TextView numberSumTV = findViewById(R.id.output);
        if(number1ET.getText().toString().equals("") ||  number2ET.getText().toString().equals("")) {
            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        }else {
            double num1 = Integer.parseInt((number1ET.getText().toString()));
            double num2 = Integer.parseInt((number2ET.getText().toString()));
            if(num2 == 0){
                Toast toast = Toast.makeText(context, "Don't Divide by 0", duration);
                toast.show();
            }else {
                double div = num1 / num2;
                numberSumTV.setText("" + Math.round(div * 100.0) / 100.0);
            }
        }
    }

    public void findPwr(View view) {
        Context context = getApplicationContext();
        EditText number1ET = findViewById(R.id.textview_input1);
        EditText number2ET = findViewById(R.id.textview_input2);
        TextView numberSumTV = findViewById(R.id.output);
        if((number1ET.getText().toString().equals("") ||  number2ET.getText().toString().equals(""))) {
            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        }else{
            double num1 = Integer.parseInt((number1ET.getText().toString()));
            double num2 = Integer.parseInt((number2ET.getText().toString()));
            double pwr = Math.pow(num1, num2);
            numberSumTV.setText("" +Math.round(pwr * 100.0) / 100.0);
        }
    }
    public void findRoot(View view) {
        Context context = getApplicationContext();
        EditText number1ET = findViewById(R.id.textview_input1);
        EditText number2ET = findViewById(R.id.textview_input2);
        TextView numberSumTV = findViewById(R.id.output);
        if((number1ET.getText().toString().equals("") ||  number2ET.getText().toString().equals(""))) {
            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        }else{

            double num1 = Integer.parseInt((number1ET.getText().toString()));
            double num2 = Integer.parseInt((number2ET.getText().toString()));
            if(num2==0){
                Toast toast = Toast.makeText(context, "Not Possible", duration);
                toast.show();
            }else {
                double root = Math.pow(num1, 1 / num2);
                numberSumTV.setText("" + Math.round(root * 100.0) / 100.0);
            }
        }
    }
}