package com.seen.mvp.mymaterialdesign;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar= findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
        //设置NavigationIcon的点击事件监听，比如返回按钮。
        // app:navigationIcon="@drawable/abc_ic_ab_back_mtrl_am_alpha"
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }

    public void onPalette(View view) {
    PaletteActivity.launcher(this);
    }

    public void onCheQinShi(View view) {
        Translucent2Activity.launcher(this);
    }

    public void onTranslucent(View view) {
        TranslucentActivity.launcher(this);
    }

    public void onBehaviorFAB(View view) {

        BehaviorFABActivity.launcher(this);
    }

    public void onAppBarLayout(View view) {
        AppBarLayoutActivity.launcher(this);
    }

    public void onNestedScrollView_AppBarLayout(View view) {
        NestedScrollViewActivity.launcher(this);
    }

    public void onNestedScrollView_AppBarLayout_CollapsingToolbarLayout(View view) {
        NestedScrollView2Activity.launcher(this);
    }

    public void CustomBehavior(View view) {
        CustomBehaviorActivity.launcher(this);
    }

 /*   @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }*/

}
