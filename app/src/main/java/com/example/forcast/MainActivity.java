package com.example.forcast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void sendMessage(View view) {
        EditText editText = (EditText) findViewById(R.id.edit_message);
        String message = editText.getText().toString();
        setContentView(R.layout.activity_main);
        TextView textView = (TextView) findViewById(R.id.textView3);
        textView.setText(message);
    }
    public void changeCity(View view) {
        setContentView(R.layout.choise_city);
    }
}