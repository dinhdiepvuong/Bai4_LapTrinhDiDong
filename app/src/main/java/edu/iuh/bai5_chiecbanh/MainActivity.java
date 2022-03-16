package edu.iuh.bai5_chiecbanh;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvDonut;
    DonutAdapter adt;
    ArrayList<Donut> arrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvDonut = findViewById(R.id.lvDonut);
        arrayList = new ArrayList<>();

        arrayList.add(new Donut(R.drawable.donut_yellow1, "Tasty donut",
                "Spicy tasty donut family", 10));
        arrayList.add(new Donut(R.drawable.tasty_donut2, "Pink donut",
                "Spicy tasty donut family", 30));
        arrayList.add(new Donut(R.drawable.green_donut3, "Floating donut",
                "Spicy tasty donut family", 17));
        arrayList.add(new Donut(R.drawable.donut_red4, "Mondota donut",
                "Spicy tasty donut family", 9));

        adt = new DonutAdapter(MainActivity.this, R.layout.item_listview, arrayList);
        lvDonut.setAdapter(adt);
    }
}