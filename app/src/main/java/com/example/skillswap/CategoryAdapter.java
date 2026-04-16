package com.example.skillswap;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.FrameLayout;

import java.util.List;

public class CategoryAdapter extends BaseAdapter {

    LayoutInflater inflater;
    List<SkillCategory> data;
//    HashMap<String, String[]> data;
//    ArrayList<String> keys;

    public CategoryAdapter(Context context, List<SkillCategory> data) {

        this.inflater = LayoutInflater.from(context);
        this.data = data;
        //this.data = data;
//        keys = new ArrayList<>();
//
//        data = new HashMap<>();
//        String[] categoriesTC = new String[]{"Introduction to Python", "Web Development Basics", "How to Set Up a Smart Home"};
//        String[] categoriesAC = new String[]{"Digital Illustration for Beginners", "DIY Home Decor", "Calligraphy & Hand Lettering"};
//        String[] categoriesFW = new String[]{"Meditation Techniques", "Strength Training for Beginners", "Basic Yoga Poses"};
//        String[] categoriesLC = new String[]{"Conversational Spanish", "Public Speaking and Confidence Building", "Writing a Resume that Stands Out"};
//        String[] categoriesBF = new String[]{"Basics of Stocks Market Investing", "Social Media Marketing for Small Businesses", "Time Management Strategies"};
//        data.put("Technology & Coding", categoriesTC);
//        data.put("Arts & Crafts", categoriesAC);
//        data.put("Fitness & Wellness", categoriesFW);
//        data.put("Language & Communication", categoriesLC);
//        data.put("Business & Finance", categoriesBF);
//
//
//        for (Object key : data.keySet()) {
//            Log.e("anonaba", key.toString());
//            keys.add(key.toString());
//        }
    }

    @Override
    public int getCount() { return data == null ? 0 : data.size();}

    @Override
    public Object getItem(int position) { return data.get(position); }

    @Override
    public long getItemId(int position) { return  position;}

    static class ViewHolder {

        Button skillCate;
        Button skill1;
        Button skill2;
        Button skill3;
        FrameLayout flSkills;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder vh;
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.drop_box, parent, false);
            vh = new ViewHolder();

            vh.skillCate = convertView.findViewById(R.id.skillCate);
            vh.skill1 = convertView.findViewById(R.id.skill1);
            vh.skill2 = convertView.findViewById(R.id.skill2);
            vh.skill3= convertView.findViewById(R.id.skill3);
            vh.flSkills = convertView.findViewById(R.id.flSkills);

            convertView.setTag(vh);

        } else {
            vh = (ViewHolder) convertView.getTag();
        }

        SkillCategory item = data.get(position);

        vh.skillCate.setText(item.cat);
        vh.flSkills.setVisibility(View.GONE);
        vh.skill1.setText(item.s1);
        vh.skill2.setText(item.s2);
        vh.skill3.setText(item.s3);

        vh.skillCate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (vh.flSkills.getVisibility() == View.GONE) {
                    vh.flSkills.setVisibility(View.VISIBLE);
                } else {
                    vh.flSkills.setVisibility(View.GONE);
                }

            }
        });

        return convertView;
    }
    public void showToast(ViewHolder vh){

    }
}
