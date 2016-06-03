package com.lessons.vi_key.planets;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        RecyclerView mRecyclerView = (RecyclerView) findViewById(R.id.recycler_view);



        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerView.setAdapter(new RecyclerViewAdapter(getDataSet()));

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    private ArrayList<CardDataObject> getDataSet() {
        ArrayList<CardDataObject> result = new ArrayList<>();

        result.add(new CardDataObject(getString(R.string.it_names),
                arrayToString(getResources().getStringArray(R.array.it_planets)),
                ContextCompat.getDrawable(this, R.drawable.ic_adjust_24dp)));

        return result;
    }

    private String arrayToString(String[] arr) {
        StringBuilder builder = new StringBuilder();
        builder.append(arr[0]);
        int len = arr.length;
        for (int i = 1; i < len; i++) {
            builder.append("\n");
            builder.append(arr[i]);
        }
        return builder.toString();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            return true;
//        }
        switch (id) {
            case R.id.action_add_planet:
                ;
                return true;
            case R.id.action_mk_default:
                ;
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
