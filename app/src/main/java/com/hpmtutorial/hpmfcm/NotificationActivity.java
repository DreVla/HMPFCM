package com.hpmtutorial.hpmfcm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class NotificationActivity extends AppCompatActivity {

    private TextView titleTextView, bodyTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);

        titleTextView = findViewById(R.id.textview1);
        bodyTextView = findViewById(R.id.textview2);

        String title = getIntent().getStringExtra("title");
        String body = getIntent().getStringExtra("body");

        titleTextView.setText(title);
        bodyTextView.setText(body);
    }
}
