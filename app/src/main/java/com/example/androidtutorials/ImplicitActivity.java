package com.example.androidtutorials;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ImplicitActivity extends AppCompatActivity {

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_implicit);
        textView=(TextView)findViewById(R.id.textView);
        String intentSharingString=getIntent().getStringExtra("keyValue");
        textView.setText(intentSharingString);

    }
}
