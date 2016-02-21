package com.wizzywizards.projectplayground.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.wizzywizards.projectplayground.R;

/**
 * Created by kiks on 2/20/2016.
 */
public class KidsListArrayAdapter extends ArrayAdapter
{
    private Context context;
    private String[] objects;

    public KidsListArrayAdapter(Context context, String[] objects)
    {
        super(context, R.layout.kid_list_item, objects);
        this.context = context;
        this.objects = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(R.layout.kid_list_item, parent, false);
        TextView kidNameField = (TextView) rowView.findViewById(R.id.kid_list_item_name);
        kidNameField.setText(objects[position]);

        return rowView;
    }

}
