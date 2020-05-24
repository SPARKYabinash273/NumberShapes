package com.example.numbershapes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
        class Number{
            int number;
            public boolean isSquare(){
                double squareRoot=Math.sqrt(number);
                if(squareRoot==Math.floor(squareRoot))
                {
                    return true;
                }
                else{
                    return false;
                }
            }
            public boolean isTriangle(){
               int x=1;
               int triangularNumber=1;
               while (triangularNumber<number){

                    x++;
                    triangularNumber=triangularNumber+x;}
                    if (triangularNumber==number)
                {
                    return true;
                }
                else{
                    return false;
                }
            }

            }
    public void testNumber(View view){
        Log.i("Info","Button pressed");
        EditText editText=(EditText) findViewById(R.id.editText);
        String message ;
        if(editText.getText().toString().isEmpty()){
            message ="Please enter a Number";
        }else{
        Number myNumber=new Number();
        myNumber.number=Integer.parseInt(editText.getText().toString());
         message=editText.getText().toString();
        if(myNumber.isSquare() &&myNumber.isTriangle()){
            message +="is Square and is Triangular";}
            else if(myNumber.isSquare()){
                message +="is Square but not triangle";
            } else if(myNumber.isTriangle()){
                message+="is Triangle but not Square";

            }
            else {
            message += "is Neither Triangular nor Square";
        }    }
        Toast.makeText(this,message,Toast.LENGTH_SHORT).show();

        }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
