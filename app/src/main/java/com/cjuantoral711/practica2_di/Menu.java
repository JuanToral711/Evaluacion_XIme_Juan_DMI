package com.cjuantoral711.practica2_di;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.pm.PackageInfoCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.firebase.ui.auth.AuthUI;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;

public class Menu extends AppCompatActivity {
    private FirebaseAuth mAuth;
    private Button btnLogout;
    Button infoa;
    Button apiy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        infoa=(Button)findViewById(R.id.btn_info);
        apiy=(Button)findViewById(R.id.btn_apiy);

        infoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Menu.this,Info.class);
                startActivity(i);
            }
        });

        apiy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Menu.this,Apiyotube.class);
                startActivity(i);
            }
        });


        mAuth = FirebaseAuth.getInstance();
        btnLogout = findViewById(R.id.btn_cerrars);

        btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mAuth.signOut();
                Intent intent = new Intent(Menu.this, Login.class);
                startActivity(intent);
                finish();
                Toast.makeText(Menu.this, "Logout Successful !", Toast.LENGTH_SHORT).show();

            }
        });




    }

}