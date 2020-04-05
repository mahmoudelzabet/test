package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class colors extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("red","weṭeṭṭi",R.drawable.red));
        words.add(new Word("green","chokokki",R.drawable.green));
        words.add(new Word("brown","ṭakaakki",R.drawable.brown));
        words.add(new Word("gray","ṭopoppi",R.drawable.gray));
        words.add(new Word("black","kululli",R.drawable.black));
        words.add(new Word("white","kelelli",R.drawable.white));
        words.add(new Word("dusty yellow","ṭopiisә",R.drawable.dustyyellow));
        words.add(new Word("mustard yellow","chiwiiṭә",R.drawable.mustardyellow));

        WordAdapter adapter = new WordAdapter(this,words);

        ListView listView =  findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
