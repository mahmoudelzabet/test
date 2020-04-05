package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Fmembers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("father","әpә",R.drawable.baba));
        words.add(new Word("mother","әṭa",R.drawable.mathor));
        words.add(new Word("son","angsi",R.drawable.son));
        words.add(new Word("daughter","tune",R.drawable.duaghter));
        words.add(new Word("older brother","taachi",R.drawable.olderbrother));
        words.add(new Word("younger brother","chalitti",R.drawable.youngerbrother));
        words.add(new Word("older sister","teṭe",R.drawable.oldersister));
        words.add(new Word("younger sister","kolliti",R.drawable.youngersister));
        words.add(new Word("grandmother","ama",R.drawable.granadma));
        words.add(new Word("grandfather","paapa",R.drawable.grandpa));

        WordAdapter adapter = new WordAdapter(this,words);

        ListView listView =  findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
