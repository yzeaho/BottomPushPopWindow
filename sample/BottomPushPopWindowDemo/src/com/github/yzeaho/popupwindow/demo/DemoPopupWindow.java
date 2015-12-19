package com.github.yzeaho.popupwindow.demo;

import com.github.yzeaho.popupwindow.BottomPushPopupWindow;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

/**
 * BottomPushPopupWindow的简单例子
 * 
 * @author y
 */
public class DemoPopupWindow extends BottomPushPopupWindow {

    public DemoPopupWindow(Context context) {
        super(context);
    }

    @Override
    protected View generateCustomView() {
        View root = View.inflate(context, R.layout.popup_demo, null);
        View emailView = root.findViewById(R.id.email);
        emailView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dismiss();
                Toast.makeText(context, R.string.action_email, Toast.LENGTH_SHORT).show();
            }
        });
        View phoneView = root.findViewById(R.id.phone);
        phoneView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dismiss();
                Toast.makeText(context, R.string.action_phone, Toast.LENGTH_SHORT).show();
            }
        });
        View cancelView = root.findViewById(R.id.cancel);
        cancelView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dismiss();
            }
        });
        return root;
    }
}