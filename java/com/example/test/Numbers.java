package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Numbers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);


        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("one","lutti",R.drawable.one));
        words.add(new Word("two","otiiko",R.drawable.two));
        words.add(new Word("three","tolookosu",R.drawable.three));
        words.add(new Word("four","oyyisa",R.drawable.four));
        words.add(new Word("five","massokka",R.drawable.five));
        words.add(new Word("six","temmokka",R.drawable.six));
        words.add(new Word("seven","kenekaku",R.drawable.seven));
        words.add(new Word("eight","kawinta",R.drawable.eight));
        words.add(new Word("nine","wo’e",R.drawable.nine));
        words.add(new Word("ten","na’aacha",R.drawable.ten));

        WordAdapter adapter = new WordAdapter(this,words);

        ListView listView =  findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
