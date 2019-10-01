package com.hpmtutorial.hpmfcm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.firebase.messaging.FirebaseMessaging;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

	System.out.println("Start");

        Button sub_weather = findViewById(R.id.subscribe_weather);
        Button unsub_weather = findViewById(R.id.unsubscribe_weather);
        Button sub_news = findViewById(R.id.sub_news);
        Button unsub_news = findViewById(R.id.unsub_news);

        sub_weather.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseMessaging.getInstance().subscribeToTopic("weather");
                Toast.makeText(MainActivity.this, "Subscribed", Toast.LENGTH_SHORT).show();
            }
        });

        unsub_weather.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseMessaging.getInstance().unsubscribeFromTopic("weather");
                Toast.makeText(MainActivity.this, "Unsubscribed", Toast.LENGTH_SHORT).show();
            }
        });

        sub_news.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseMessaging.getInstance().subscribeToTopic("news");
                Toast.makeText(MainActivity.this, "Subscribed", Toast.LENGTH_SHORT).show();
            }
        });

        unsub_news.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseMessaging.getInstance().unsubscribeFromTopic("news");
                Toast.makeText(MainActivity.this, "Unsubscribed", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
