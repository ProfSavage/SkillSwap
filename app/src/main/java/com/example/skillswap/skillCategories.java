package com.example.skillswap;

import android.os.Bundle;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.List;

public class skillCategories extends AppCompatActivity {

    ListView lv;
    CategoryAdapter adapter;
    List<SkillCategory> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_skill_categories);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

            data = new ArrayList<>();
            data.add(new SkillCategory("Technology & Coding","Introduction to Python", "Web Development Basics", "How to Set Up a Smart Home"));
            data.add(new SkillCategory("Arts & Crafts","Digital Illustration for Beginners", "DIY Home Decor", "Calligraphy & Hand Lettering"));
            data.add(new SkillCategory("Fitness & Wellness","Meditation Techniques", "Strength Training for Beginners", "Basic Yoga Poses"));
            data.add(new SkillCategory("Language & Communication","Conversational Spanish", "Public Speaking and Confidence Building", "Writing a Resume that Stands Out"));
            data.add(new SkillCategory("Business & Finance","Basics of Stocks Market Investing", "Social Media Marketing for Small Businesses", "Time Management Strategies"));


        adapter = new CategoryAdapter(this, data);
            lv = findViewById(R.id.lvCategory);
            lv.setAdapter(adapter);

    }
}