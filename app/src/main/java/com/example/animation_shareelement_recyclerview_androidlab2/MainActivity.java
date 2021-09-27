package com.example.animation_shareelement_recyclerview_androidlab2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {
        RecyclerView recyclerView;
        SingerAdapter adapter;
        LinkedList<Singer> persons = new LinkedList<>();
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            recyclerView = findViewById(R.id.recyclerView);

            persons.add(new Singer("Taylor Swift1", "Love Story", R.drawable.eclipse));
            persons.add(new Singer("The Weekend", "The Hill", R.drawable.eclipse));
            persons.add(new Singer("Taylor Swift", "Love Story", R.drawable.eclipse));
            persons.add(new Singer("Taylor Swift", "Love Story", R.drawable.eclipse));

            adapter = new SingerAdapter(persons, this, this);
            recyclerView.setAdapter(adapter);
            recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));

        }

    }
