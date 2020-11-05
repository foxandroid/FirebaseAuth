package com.example.firebaseauth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.google.firebase.auth.FirebaseAuth;

public class Splashscreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);

        Intent i;
        if (FirebaseAuth.getInstance().getCurrentUser() != null){

            i = new Intent(Splashscreen.this,MainActivity2.class);

        }else {

            i = new Intent(Splashscreen.this,MainActivity.class);

        }

        startActivity(i);
        finish();

    }
}