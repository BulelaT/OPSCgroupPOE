package com.example.opsc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    // Declaration of variables ()
    Button LoginButton;
    Button RegisterButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

/*        BottomNavigationView bottomNav = findViewById(R.id.bottom_navigation);
        bottomNav.setOnNavigationItemSelectedListener(navListener);

        // as soon as the application opens the first
        // fragment should be shown to the user
        // in this case it is algorithm fragment
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new SelectTour()).commit();*/

        // Assigning buttons ()
        LoginButton = (Button) findViewById(R.id.loginFrag);
        RegisterButton = (Button) findViewById(R.id.registerFrag);

        // The following listener will redirect the user to the dashboard ()
        LoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
/*                Fragment selectedFragment = null;
                int itemId = v.getId();
                if (itemId == R.id.loginFrag) {
                    selectedFragment = new Dashboard();
                }

                // It will help to replace the
                // one fragment to other.
                if (selectedFragment != null) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, selectedFragment).commit();
                }*/
                getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout, new Dashboard()).commit();
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

/*    private final BottomNavigationView.OnNavigationItemSelectedListener navListener = item -> {
        // By using switch we can easily get
        // the selected fragment
        // by using there id.
        Fragment selectedFragment = null;
        int itemId = item.getItemId();
        if (itemId == R.id.Dashboard_Nav) {
            selectedFragment = new Dashboard();
        }
        else if (itemId == R.id.Landmark_Nav) {
            selectedFragment = new DisplayLandFragment();
        }
        else if (itemId == R.id.Camera_Nav) {
            selectedFragment = new AddLandmark();
        }
        else if (itemId == R.id.Settings_Nav) {
            selectedFragment = new SettingsPage();
        }
*//*        else if (itemId == R.id.SignOut_Nav) {
            selectedFragment = new MainActivity();
        }*//*


        // It will help to replace the
        // one fragment to other.
        if (selectedFragment != null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, selectedFragment).commit();
        }
        return true;
    };*/


}