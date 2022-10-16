package com.example.opsc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    // Declaration of variables ()
    Button LoginButton;
    Button RegisterButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Assigning buttons ()
        LoginButton = (Button) findViewById(R.id.loginFrag);
        RegisterButton = (Button) findViewById(R.id.registerFrag);

        // The following listener will redirect the user to the dashboard ()
        LoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.MainContainer,new Dashboard()).commit();
            }
        });

        // The following listener will redirect the user to the register page ()
        RegisterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), RegisterFragment.class);
                view.getContext().startActivity(intent);
            }
        });

    }


}