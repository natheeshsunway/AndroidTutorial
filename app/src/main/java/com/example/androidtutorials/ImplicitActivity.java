package com.example.androidtutorials;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ImplicitActivity extends AppCompatActivity {

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_implicit);
        textView=(TextView)findViewById(R.id.textView);


        Person person=(Person) getIntent().getParcelableExtra("keyValue");

        textView.setText(person.getFirstName()+"----"+person.getLastName());

    }
}
