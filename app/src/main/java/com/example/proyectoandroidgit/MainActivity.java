package com.example.proyectoandroidgit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.sql.SQLOutput;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        System.out.println("Yo estuve aquí, soy el Daniel");

        System.out.println("Sí, aquí");

        System.out.println("Ahora yo hice otro cambio");
    }
}