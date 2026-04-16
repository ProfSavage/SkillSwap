package com.example.skillswap;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    public static List<SkillData> dataS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        DataHolder dh = new DataHolder();

        dataS = new ArrayList<>();
        dataS.add(new SkillData("Introduction to Python", "Sir A", "Sir B", "Ma'am C"));
        dataS.add(new SkillData("Web Development Basics", "Sir B", "Ma'am C", "Ma'am D"));
        dataS.add(new SkillData("How to Set Up a Smart Home", "Sir A", "Ma'am C", "Ma'am D"));
        dataS.add(new SkillData("Digital Illustration for Beginners", "Sir E", "Ma'am F", "Ma'am G"));
        dataS.add(new SkillData("DIY Home Decor", "Ma'am F", "Ma'am G", "Sir H"));
        dataS.add(new SkillData("Calligraphy & Hand Lettering", "Sir E", "Ma'am G", "Sir H"));
        dataS.add(new SkillData("Meditation Techniques", "Ma'am I", "Ma'am J", "Ma'am K"));
        dataS.add(new SkillData("Strength Training for Beginners", "Ma'am J", "Ma'am K", "Sir L"));
        dataS.add(new SkillData("Basic Yoga Poses", "Ma'am I", "Ma'am K", "Sir L"));
        dataS.add(new SkillData("Conversational Spanish", "Ma'am M", "Sir N", "Ma'am O"));
        dataS.add(new SkillData("Public Speaking and Confidence Building", "Ma'am M", "Ma'am O", "Sir P"));
        dataS.add(new SkillData("Writing a Resume that Stands Out", "Sir N", "Ma'am O", "Sir P"));
        dataS.add(new SkillData("Basics of Stocks Market Investing", "Sir Q", "Sir R", "Sir S"));
        dataS.add(new SkillData("Social Media Marketing for Small Businesses", "Sir Q", "Sir S", "Ma'am T"));
        dataS.add(new SkillData("Time Management Strategies", "Sir R", "Sir S", "Ma'am T"));

    }

    public void categoriesPressed(View view) {

        try {
            Intent i = new Intent(this, skillCategories.class);
            startActivity(i);
        } catch (Exception e)
        {
            e.printStackTrace();
        }

    }

    public void skillPressed(View view) {

        Intent i = new Intent(this, skilllisting.class);
        startActivity(i);

    }
}