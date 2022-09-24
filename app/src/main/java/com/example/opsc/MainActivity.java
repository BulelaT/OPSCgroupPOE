package com.example.opsc;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.google.android.gms.common.api.Status;
import com.google.android.libraries.places.api.Places;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.widget.AutocompleteSupportFragment;
import com.google.android.libraries.places.widget.listener.PlaceSelectionListener;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    String apiKey = "AIzaSyDScPbh0_N-yvI4cDGLq2_TEwlavWiY8k8";
    private String TAG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);

        //Below section of code is necessary for initialization and implementation of
        //the places autocomplete fragments.
        //====================================================================================
        // Initialize the SDK
        Places.initialize(getApplicationContext(), apiKey);

        // Initialize the startLocation autocompleteSupportFragment.
        AutocompleteSupportFragment startLocation = (AutocompleteSupportFragment)
                getSupportFragmentManager().findFragmentById(R.id.startLocation);

        // Specify the types of place data to return.
        startLocation.setPlaceFields(Arrays.asList(Place.Field.ID, Place.Field.NAME));

        // Set up a PlaceSelectionListener to handle the response.
        startLocation.setOnPlaceSelectedListener(new PlaceSelectionListener() {
            @Override
            public void onPlaceSelected(@NonNull Place place) {
                // TODO: Get info about the selected place.
                Log.i(TAG, "Place: " + place.getName() + ", " + place.getId());
            }

            @Override
            public void onError(@NonNull Status status) {
                // TODO: Handle the error.
                Log.i(TAG, "An error occurred: " + status);
            }
        });

        // Initialize the destination autocompleteSupportFragment.
        AutocompleteSupportFragment destination = (AutocompleteSupportFragment)
                getSupportFragmentManager().findFragmentById(R.id.destination);

        // Specify the types of place data to return.
        destination.setPlaceFields(Arrays.asList(Place.Field.ID, Place.Field.NAME));

        // Set up a PlaceSelectionListener to handle the response.
        destination.setOnPlaceSelectedListener(new PlaceSelectionListener() {
            @Override
            public void onPlaceSelected(@NonNull Place place) {
                // TODO: Get info about the selected place.
                Log.i(TAG, "Place: " + place.getName() + ", " + place.getId());
            }

            @Override
            public void onError(@NonNull Status status) {
                // TODO: Handle the error.
                Log.i(TAG, "An error occurred: " + status);
            }
        });
        //End of places autocomplete fragment code.
        //====================================================================================


    }
}