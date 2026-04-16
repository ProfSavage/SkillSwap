package com.example.skillswap;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class skilldescription extends AppCompatActivity {

    TextView tvName;
    String m1, m2, m3;
    TextView tvm1, tvm2, tvm3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_skilldescription);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        tvName = findViewById(R.id.textView5);
        tvName.setText(DataHolder.selectedSkill);

        for (SkillData i: MainActivity.dataS) {
            if (i.skill.equals(tvName.getText())) {
                m1 = i.m1;
                m2 = i.m2;
                m3 = i.m3;
                break;
            }
        }

        tvm1 = findViewById(R.id.tvm1);
        tvm2 = findViewById(R.id.tvm2);
        tvm3 = findViewById(R.id.tvm3);

        tvm1.setText(m1);
        tvm2.setText(m2);
        tvm3.setText(m3);


        
    }

    public void
}