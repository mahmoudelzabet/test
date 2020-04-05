package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class phrases extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("Where are you going?","minto wuksus",0));
        words.add(new Word("What is your name?","tinnә oyaase'nә",0));
        words.add(new Word("My name is...","oyaaset...",0));
        words.add(new Word("How are you feeling?","michәksәs?",0));
        words.add(new Word("I’m feeling good.","kuchi achit",0));
        words.add(new Word("Are you coming?","әәnәs'aa?",0));
        words.add(new Word("Yes, I’m coming.","hәә’ әәnәm",0));
        words.add(new Word("I’m coming.","әәnәm",0));
        words.add(new Word("Let’s go.","yoowutis",0));
        words.add(new Word("Come here.","әnni'nem",0));

        WordAdapter adapter = new WordAdapter(this,words);

        ListView listView =  findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}
