package com.example.busnexa;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;
public class login extends AppCompatActivity
{
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        button=findViewById(R.id.getotp);
        button.setOnClickListener(view -> {
            Toast.makeText(login.this,"Logging In",Toast.LENGTH_SHORT).show();
            Intent intent= new Intent(login.this,otpsubmit.class);
            startActivity(intent);
        });
    }
}