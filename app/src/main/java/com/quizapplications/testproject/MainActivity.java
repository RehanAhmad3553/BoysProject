package com.quizapplications.testproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import com.quizapplications.testproject.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());

        setContentView(binding.getRoot());


        Toast.makeText(this, "First Toast", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "First Toast", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "First Toast", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "First Toast", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "First Toast", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "First Toast", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "First Toast", Toast.LENGTH_SHORT).show();









    }


}