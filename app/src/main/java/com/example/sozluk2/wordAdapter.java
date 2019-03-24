package com.example.sozluk2;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

public class wordAdapter extends BaseAdapter {

    private Context context;
    private List<Word>words;
    private int resimId;

    public wordAdapter(Context context, List<Word>words,int resimId) {
        this.context=context;
        this.words=words;
        this.resimId=resimId;

    }

    @Override
    public int getCount() {
        return words.size();
    }

    @Override
    public Object getItem(int position) {
        return words.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v = View.inflate(context,R.layout.list_item,null);
        ImageView iv=(ImageView)v.findViewById(R.id.image);
        TextView tvfransızca =(TextView)v.findViewById(R.id.fransızca_tv);
        TextView tvturkce =(TextView)v.findViewById(R.id.turkce_tv);
        LinearLayout layout=(LinearLayout)v.findViewById(R.id.text_container);
        iv.setImageResource(words.get(position).getResimId());
        tvfransızca.setText(words.get(position).getFransizca());
        tvturkce.setText(words.get(position).getTurkce());
        layout.setBackgroundColor(resimId);
        return v;
    }
}
