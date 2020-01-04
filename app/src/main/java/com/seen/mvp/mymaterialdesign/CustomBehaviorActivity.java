package com.seen.mvp.mymaterialdesign;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.seen.mvp.mymaterialdesign.customview.MyScrollView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.ViewCompat;

/**
 * 调色板 的使用
 */
public class CustomBehaviorActivity extends AppCompatActivity  {

    private Toolbar toolbar;
    private MyScrollView scv;

    private TextView tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_behvaior);
        tv1 = (TextView)findViewById(R.id.tv1);
        tv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewCompat.offsetTopAndBottom(v, 9);
            }
        });
    }



    public static void launcher(Context context)
    {
        Intent intent =new Intent(context, CustomBehaviorActivity.class);
        context.startActivity(intent);
    }


}
