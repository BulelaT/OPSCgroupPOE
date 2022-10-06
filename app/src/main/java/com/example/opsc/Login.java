package com.example.opsc;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity {
    EditText username, password, email;
    Button LoginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initializing UI components to declared variables ()
       // username = (EditText) findViewById(R.id);
       // password = (EditText) findViewById(R.id);
       // email = (EditText) findViewById(R.id);
       // LoginButton = (Button) findViewById(R.id);
    }
}
