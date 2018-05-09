package com.lucaslimeira.testing;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.items_list);
        ArrayList<Item> items = new ArrayList<>();

        for (int i = 1; i <= 50; i++) {
            items.add(new Item(i, "Item " + i));
        }

        ItemAdapter adapter = new ItemAdapter(this, R.layout.item_fragment, items);
        listView.setAdapter(adapter);
    }
}
