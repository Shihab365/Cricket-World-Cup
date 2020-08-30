package com.pro1.asus.cric_pro_1.Utils;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.pro1.asus.cric_pro_1.Model.Movie;
import com.pro1.asus.cric_pro_1.R;
import com.squareup.picasso.Picasso;

import java.util.List;

public class MovieAdapter extends BaseAdapter {
    private Context context;
    private List<Movie> movieList;

    public MovieAdapter(Context context, List<Movie> movieList) {
        this.context = context;
        this.movieList = movieList;
    }

    @Override
    public int getCount() {
        return movieList.size();
    }

    @Override
    public Object getItem(int position) {
        return movieList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        View rowView=view;
        if(rowView==null)
        {
            rowView=LayoutInflater.from(context).inflate(R.layout.layout_item,null);
            TextView name=(TextView)rowView.findViewById(R.id.nameid);
            ImageView imageView=(ImageView) rowView.findViewById(R.id.imageid);

            Picasso.get().load(movieList.get(position).getImage()).into(imageView);
            name.setText(movieList.get(position).getName());
        }
        return rowView;
    }
}
