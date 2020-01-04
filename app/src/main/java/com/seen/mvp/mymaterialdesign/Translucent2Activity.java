package com.seen.mvp.mymaterialdesign;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import com.seen.mvp.mymaterialdesign.customview.MyScrollView;
import com.seen.mvp.mymaterialdesign.linistener.TranslucentListener;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

/**
 * 沉浸式 的使用
 */
public class Translucent2Activity extends AppCompatActivity implements TranslucentListener {

    private Toolbar toolbar;
    private MyScrollView scv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //设置状态栏的透明属性
//		getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);//全屏
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        setContentView(R.layout.activity_translucent2);
        //5.0+可以直接用API来修改状态栏的颜色。
//		getWindow().setStatusBarColor(getResources().getColor(R.color.material_blue_grey_800));
        //1.先设置toolbar的高度
        toolbar = (Toolbar)findViewById(R.id.toolbar);
//		LayoutParams params = toolbar.getLayoutParams();
//		int statusBarHeight = getStatusBarHeight(this);
//		params.height += statusBarHeight ;
//		toolbar.setLayoutParams(params );
        //2.设置paddingTop，以达到状态栏不遮挡toolbar的内容。
        toolbar.setPadding(
                toolbar.getPaddingLeft(),
                toolbar.getPaddingTop()+getStatusBarHeight(this),
                toolbar.getPaddingRight(),
                toolbar.getPaddingBottom());

    }

    /**
     * 获取状态栏的高度
     * @param context
     * @return
     */
    private int getStatusBarHeight(Context context) {
        // 反射手机运行的类：android.R.dimen.status_bar_height.
        int statusHeight = -1;
        try {
            Class<?> clazz = Class.forName("com.android.internal.R$dimen");
            Object object = clazz.newInstance();
            String heightStr = clazz.getField("status_bar_height").get(object).toString();
            int height = Integer.parseInt(heightStr);
            //dp--->px
            statusHeight = context.getResources().getDimensionPixelSize(height);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return statusHeight;
    }

    public static void launcher(Context context)
    {
        Intent intent =new Intent(context, Translucent2Activity.class);
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

    public void showPopup(View view) {
    }

    public void showPopupMenu(View view) {
    }

    public void showDialog(View view) {
    }
}
