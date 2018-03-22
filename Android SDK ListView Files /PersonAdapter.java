package com.example.android_sp17.healthreport;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by android-sp17 on 3/27/17.
 */

    public class PersonAdapter extends BaseAdapter {

    private Context mContext;
    private LayoutInflater mInflater;
    private ArrayList<Person> mDataSource;

    public PersonAdapter(Context context, ArrayList<Person> items)
    {
        mContext = context;
        mDataSource = items;
        mInflater = (LayoutInflater)

                mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }

    @Override
    public int getCount(){
        return mDataSource.size();
    }

    @Override
    public Object getItem(int position){
        return mDataSource.get(position);
    }

    @Override
    public long getItemId(int position){
        return position;
    }

    public View getView(int position, View convertView, ViewGroup parent){
        View rowView = mInflater.inflate(R.layout.list_item_person,parent,false);

        Person p = mDataSource.get(position);
        TextView titleTextView = (TextView) rowView.findViewById(R.id.textView);
        titleTextView.setText(p.getName());

        TextView titleTextView2 = (TextView) rowView.findViewById(R.id.textView2);
        titleTextView2.setText("You have lived " + p.getDaysLived()  +" \n days");

        TextView titleTextView3 = (TextView) rowView.findViewById(R.id.textView3);
        titleTextView3.setText("BMI:\n"  + String.format("%.2f",p.getBMI()));
        ImageView thumbnailImageView = (ImageView) rowView.findViewById(R.id.imageView);
        if(p.getBMI() < 18.5 || p.getBMI() >= 30)
        {
            thumbnailImageView.setImageResource(R.drawable.ic_action_name);
        }
        else
        {
            thumbnailImageView.setImageResource(R.drawable.ic_ok_name);
        }

        return rowView;
    }


}


