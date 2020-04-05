package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView num = findViewById(R.id.Numbers);
        TextView members = findViewById(R.id.Members);
        TextView col = findViewById(R.id.Colors);
        TextView phrase = findViewById(R.id.Phrases);

        num.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(v.getContext(),"Hey",Toast.LENGTH_SHORT).show();
                Intent i = new Intent(v.getContext(),Numbers.class);
                startActivity(i);
            }
        });
        members.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(),Fmembers.class);
                startActivity(i);
            }
        });
        col.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(v.getContext(),"Hey",Toast.LENGTH_SHORT).show();
                Intent i = new Intent(v.getContext(),colors.class);
                startActivity(i);
            }
        });
        phrase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(),phrases.class);
                startActivity(i);
            }
        });
    }


}
