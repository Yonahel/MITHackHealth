package com.wizzywizards.projectplayground.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.wizzywizards.projectplayground.R;

/**
 * Created by kiks on 2/21/2016.
 */
public class IncentiveListArrayAdapter extends ArrayAdapter
{
    private Context context;
    private String[] objects;

    public IncentiveListArrayAdapter(Context context, String[] objects)
    {
        super(context, R.layout.incentive_list_item, objects);

        this.context = context;
        this.objects = objects;



    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(R.layout.incentive_list_item, parent, false);
        TextView incentiveNameField = (TextView) rowView.findViewById(R.id.incentive_item_name);
        incentiveNameField.setText(objects[position]);

        return rowView;
    }

}
