package com.example.user1.androidassignment84;

/*
Custom Adaptor Class extends BaseAdaptor class to implements the method for better functionality
 */

// Required Classes imported
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;


// Class start here.
public class CustomAdaptor extends BaseAdapter {



    // consturctor for class to pass Data to main activity
    public CustomAdaptor(Context context ,String[] tittles, int[] images) {
        this.tittles = tittles;
        this.context=context;
        this.images = images;
    }

     // refence variable of required class
    Context context;
    private final String[] tittles;
    private final int[] images;
    View view;
    LayoutInflater layoutinfalt;



    @Override
    // get count method to check the length of array and DATA
    public int getCount() {
        return tittles.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // LayoutInflater to get layout of Image view and text view
        layoutinfalt= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        // if convertView is null fro make new layout with layoutinfalter
        if(convertView==null){
            view = new View(context);
            view= layoutinfalt.inflate(R.layout.imageandtext,null);
            ImageView imageview= (ImageView) view.findViewById(R.id.imageView);
            TextView textview= (TextView) view.findViewById(R.id.textview);
            imageview.setImageResource(images[position]);
            textview.setText(tittles[position]);

        }


        return view;// returns View class refence
    }
}
//Class closed.