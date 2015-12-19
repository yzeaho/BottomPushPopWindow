package com.github.yzeaho.popupwindow.demo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickShow(View v) {
        DemoPopupWindow pw = new DemoPopupWindow(this);
        pw.show(this);
    }
}
