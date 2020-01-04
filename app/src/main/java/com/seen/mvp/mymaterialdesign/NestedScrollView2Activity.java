package com.seen.mvp.mymaterialdesign;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.seen.mvp.mymaterialdesign.customview.MyScrollView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;

/**
 * 调色板 的使用
 */
public class NestedScrollView2Activity extends AppCompatActivity {

    private Toolbar toolbar;
    private MyScrollView scv;

    private RecyclerView recyclerview;
    private ImageButton fab;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nestedscrollview2_layout);
//        getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
//        setTitle("动脑学院");
    }



    public static void launcher(Context context)
    {
        Intent intent =new Intent(context, NestedScrollView2Activity.class);
        context.startActivity(intent);
    }

    public void rotate(View view) {
    }
}
