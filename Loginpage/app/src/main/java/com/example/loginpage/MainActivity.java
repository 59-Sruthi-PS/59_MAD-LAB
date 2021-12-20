package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText username;
    private EditText password;
    private TextView Info;
    private Button login;
    private int counter = 5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        username = (EditText) findViewById(R.id.etname);
        password = (EditText) findViewById(R.id.password);
        Info = (TextView) findViewById(R.id.info);
        login = (Button) findViewById(R.id.button);


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (username.getText().toString().equals("sruthi") && password.getText().toString().equals("1828")) {
                    Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                    startActivity(intent);
                } else
                    {
                    counter--;
                    Info.setText("No of attempts remaining" + counter);
                    if (counter == 0)
                    {
                        Info.setText("Login failed");
                        login.setEnabled(false);
                        Toast.makeText(MainActivity.this, "login failed", Toast.LENGTH_LONG).show();
                    }
                }
            }
        });

    }
}

