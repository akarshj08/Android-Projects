package com.example.busnexa;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

public class update_seat extends AppCompatActivity
{
    EditText editText,editText2,editText3,editText4;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_seat);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        editText= findViewById(R.id.edit);
        button = findViewById(R.id.button);
        editText2= findViewById(R.id.edit2);
        editText3= findViewById(R.id.edit3);
        editText4= findViewById(R.id.edit4);

        button.setOnClickListener(v -> {
            String str = editText.getText().toString();
            String str2= editText2.getText().toString();
            String str3= editText3.getText().toString();
            String str4= editText4.getText().toString();
            Intent intent = new Intent(getApplicationContext(),front.class);
            intent.putExtra("No of seats 1", str);
            intent.putExtra("No of seats 2", str2);
            intent.putExtra("No of seats 3", str3);
            intent.putExtra("No of seats 4", str4);
            startActivity(intent);
        });

    }
}