package com.example.busnexa;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;
import com.google.android.material.appbar.MaterialToolbar;

public class otpsubmit extends AppCompatActivity
{
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otpsubmit);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        button=findViewById(R.id.submit_otp);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(otpsubmit.this,"Logging In",Toast.LENGTH_SHORT).show();
                Intent intent= new Intent(otpsubmit.this,front.class);
                startActivity(intent);

            }
        });

        MaterialToolbar materialToolbar;
        materialToolbar=findViewById(R.id.top_bar);

        materialToolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();

            }
        });
    }
}