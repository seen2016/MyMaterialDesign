package com.seen.mvp.mymaterialdesign;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

import com.seen.mvp.mymaterialdesign.adapters.FabRecyclerAdapter;
import com.seen.mvp.mymaterialdesign.customview.MyScrollView;

import java.util.ArrayList;
import java.util.List;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/**
 * 调色板 的使用
 */
public class BehaviorFABActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private MyScrollView scv;

    private RecyclerView recyclerview;
    private ImageButton fab;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_behaviorfab);
        recyclerview = (RecyclerView)findViewById(R.id.recyclerview);
        fab = (ImageButton)findViewById(R.id.fab);

        toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        setTitle("动脑学院");
//		recyclerview.setOnScrollListener(null);
//		recyclerview.addOnScrollListener(new FabScrollListener(this));

        recyclerview.setLayoutManager(new LinearLayoutManager(this));
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 60; i++) {
            list.add("Item"+i);
        }
        RecyclerView.Adapter adapter = new FabRecyclerAdapter(list);
        recyclerview.setAdapter(adapter );
    }



    public static void launcher(Context context)
    {
        Intent intent =new Intent(context, BehaviorFABActivity.class);
        context.startActivity(intent);
    }

}
