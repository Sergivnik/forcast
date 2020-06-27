package com.example.forcast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class choiseCity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choise_city);
    }

    public void onClick(View view){
        final EditText nameCity = findViewById(R.id.edit_message);
        final EditText valueTemperature = findViewById(R.id.edit_message2);

        String city = nameCity.getText().toString();
        String temperature = valueTemperature.getText().toString();

        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("city", city);
        intent.putExtra("temperature", temperature);
        //finish();
        startActivity(intent);
    }
}