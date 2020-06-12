package com.example.androidtutorials;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=(Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Person person=new Person("Omm","NamaShivaya");

                Intent intent=new Intent();
                intent.setAction("com.sample.intent");
                intent.addCategory(Intent.CATEGORY_DEFAULT);
                intent.putExtra("keyValue",person);
                startActivity(intent);
            }
        });
    }
}
