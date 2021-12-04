package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button startBtn, bookmarkBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startBtn=findViewById(R.id.start_btn);
        bookmarkBtn = findViewById(R.id.bookmarks_btn);

        startBtn.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {

                                            Intent CategoryIntent = new Intent(MainActivity.this,CategoriesActivity.class);
                                            startActivity(CategoryIntent);

                                        }
                                    }
        );

        bookmarkBtn.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {

                                            Intent bookmarksIntent = new Intent(MainActivity.this,BookmarkActivity.class);
                                            startActivity(bookmarksIntent);

                                        }
                                    }
        );

    }
}