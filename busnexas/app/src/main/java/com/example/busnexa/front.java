package com.example.busnexa;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
public class front extends AppCompatActivity
{
    ImageView imageView;
    ImageView imageView2;
    TextView textView1,textView2,textView3,textView4;
    CardView cardView1;
    CardView cardView2;
    CardView cardView3;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_front);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        imageView=findViewById(R.id.image);
        textView1=findViewById(R.id.seat1);
        textView2=findViewById(R.id.seat2);
        textView3=findViewById(R.id.seat3);
        textView4=findViewById(R.id.seat4);
        cardView1=findViewById(R.id.card1);
        cardView2=findViewById(R.id.card2);
        cardView3=findViewById(R.id.card3);
        imageView2=findViewById(R.id.map);

        Intent intent = getIntent();
        String str = intent.getStringExtra("No of seats 1");
        String str2 = intent.getStringExtra("No of seats 2");
        String str3 = intent.getStringExtra("No of seats 3");
        String str4 = intent.getStringExtra("No of seats 4");
        textView1.setText(str);
        textView2.setText(str2);
        textView3.setText(str3);
        textView4.setText(str4);

        imageView.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent= new Intent(front.this,update_seat.class);
                startActivity(intent);
            }
        });

        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://chalo.com/chalo-card"));
                startActivity(intent);
            }
        });

        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://chalo.com/chalo-app/mobile-bus-pass"));
                startActivity(intent);
            }
        });

        cardView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://chalo.com/chalo-app/mobile-ticket"));
                startActivity(intent);
            }
        });

        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.google.com/maps/@23.2539865,77.4436468,11.6z?entry=ttu"));
                startActivity(intent);
            }
        });

    }
}