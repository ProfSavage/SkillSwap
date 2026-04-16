package com.example.skillswap;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;

import java.util.List;

public class SkillAdapter extends BaseAdapter {

    LayoutInflater inflater;
    List<SkillData> data;

    public SkillAdapter(Context context, List<SkillData> data) {
        this.inflater = LayoutInflater.from(context);
        this.data = data;
    }

    @Override
    public int getCount() { return data == null? 0 : data.size();
    }

    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    static class ViewHolder {
        Button skill;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder vh;
        if (convertView == null) {

            convertView = inflater.inflate(R.layout.skillistrow, parent, false);

            vh = new ViewHolder();
            vh.skill = convertView.findViewById(R.id.skill);

            convertView.setTag(vh);
        } else {
            vh = (ViewHolder) convertView.getTag();
        }

        SkillData item = data.get(position);
        vh.skill.setText(item.skill);

        return convertView;
    }
}
