package com.example.busnexa;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final int SPLASH_SCR=2500;

    Animation topAnim, bottomAnim;
    ImageView image1;
    TextView text1,text2,text3;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        topAnim= AnimationUtils.loadAnimation(this,R.anim.top_animat);
        bottomAnim= AnimationUtils.loadAnimation(this,R.anim.bottom_anim);

        image1=findViewById(R.id.imageView1);
        text2=findViewById(R.id.textView2);
        text3=findViewById(R.id.hello);

        image1.setAnimation(topAnim);
        text2.setAnimation(topAnim);
        text3.setAnimation(topAnim);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent= new Intent(MainActivity.this,login.class);
                startActivity(intent);
                finish();
            }
        },SPLASH_SCR);

    }
}