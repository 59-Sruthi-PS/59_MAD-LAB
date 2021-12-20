package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
        private EditText ed1;
        private EditText ed2;
        private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1=(EditText)findViewById(R.id.ed1);
        ed2=(EditText)findViewById(R.id.ed2);
        tv1=(TextView) findViewById(R.id.tv1);

    }

    public void buttonsum(View view)
    {
        int n1=Integer.parseInt(ed1.getText().toString());
        int n2=Integer.parseInt(ed2.getText().toString()) ;
        int result=n1+n2;
        tv1.setText(String.valueOf(result));
    }

    public void buttonsub(View view) {
        int n1=Integer.parseInt(ed1.getText().toString());
        int n2=Integer.parseInt(ed2.getText().toString()) ;
        int result=n1-n2;
        tv1.setText(String.valueOf(result));
    }

    public void buttonmul(View view) {
        int n1=Integer.parseInt(ed1.getText().toString());
        int n2=Integer.parseInt(ed2.getText().toString()) ;
        int result=n1*n2;
        tv1.setText(String.valueOf(result));
    }

    public void buttondiv(View view) {
        int n1=Integer.parseInt(ed1.getText().toString());
        int n2=Integer.parseInt(ed2.getText().toString()) ;
        int result=n1/n2;
        tv1.setText(String.valueOf(result));
    }
}