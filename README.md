# BottomPushPopWindow
从下方弹出的PopupWindow,仿iphone效果，增加半透明蒙层动画。<br>
支持android4.0及以上版本。

#实现原理
在弹出自定义的PopupWindow时，增加一个半透明蒙层view到窗口，并置于PopupWindow下方。

#How to Use
继承BottomPushPopupWindow，编写generateCustomView添加自定义的view，调用showAtLocation方法显示。
