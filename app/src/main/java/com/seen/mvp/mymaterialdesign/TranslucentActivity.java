package com.seen.mvp.mymaterialdesign;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.seen.mvp.mymaterialdesign.customview.MyScrollView;
import com.seen.mvp.mymaterialdesign.linistener.TranslucentListener;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

/**
 * 调色板 的使用
 */
public class TranslucentActivity extends AppCompatActivity implements TranslucentListener {

    private Toolbar toolbar;
    private MyScrollView scv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_translucent);
        toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        scv = (MyScrollView)findViewById(R.id.scrollView);
        scv.setTranslucentListener(this);
    }



    public static void launcher(Context context)
    {
        Intent intent =new Intent(context, TranslucentActivity.class);
        context.startActivity(intent);
    }

    /**
     * 透明度的回调监听
     *
     * @param alpha 0~1 透明度
     */
    @Override
    public void onTranlucent(float alpha) {
        toolbar.setAlpha(alpha);
    }
}
