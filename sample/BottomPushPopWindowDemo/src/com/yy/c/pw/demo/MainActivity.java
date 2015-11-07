package com.yy.c.pw.demo;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickShow(View v) {
        DemoPopupWindow pw = new DemoPopupWindow(this);
        pw.showAtLocation(getWindow().getDecorView(), Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL, 0, 0);
    }
}
