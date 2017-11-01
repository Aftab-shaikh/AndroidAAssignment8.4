package com.example.user1.androidassignment84;

/*
 This project is example of GridView
 to show Image and repective Image tittle
 in grid view UI
 */

// Imported Required Class.
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;


//Class Startedb here.
public class MainActivity extends AppCompatActivity {

    // private GridView Refence variable.
    private GridView gridview;

    // String Data for tittles of Images
    String[] tittles={"Kitkat" ,"GingerBread", "IceCream" , "JellyBean", "Lollipop", "Honeycomb" };

    // int Data array Images for tittles
    int[] images={R.drawable.kitkatt,R.drawable.gingerbredpic,R.drawable.icecream,R.drawable.jellybeanpic,R.drawable.lolipop,R.drawable.honey};

    @Override
    // Oncreat Method as main method
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         // Id assigned to girdView
        gridview= (GridView) findViewById(R.id.gridview);

        // Object of CustomAdaptor
        CustomAdaptor customAdaptor= new CustomAdaptor(this,tittles,images);

        // Adaptor assinged to gridview
        gridview.setAdapter(customAdaptor);

    }
}
//class closed.