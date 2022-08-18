package com.gzeinnumer.recyclerviewadapterbuilder_old;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initRV();
    }

    private void initRV() {
        RecyclerView rv = findViewById(R.id.rv);
        DummyAdapterV2 adapter = new DummyAdapterV2(R.layout.item_rv, position -> {

        });

        rv.setAdapter(adapter);
        rv.hasFixedSize();
        rv.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
    }
}