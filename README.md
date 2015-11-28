# BottomPushPopWindow
很多应用的这个功能体验都不太好，贡献给大家一个，自己弄圆角图片，或按照UI的切图进行贴图。<br>
从下方弹出的PopupWindow，仿iphone效果，增加半透明蒙层动画。<br>
支持android4.0及以上版本。

#实现原理
在弹出自定义的PopupWindow时，增加一个半透明蒙层view到窗口，并置于PopupWindow下方。

#Demo
<a href="https://raw.githubusercontent.com/yzeaho/BottomPushPopWindow/master/ButtomPushPopWindowDemo.apk">BottomPushPopWindowDemo.apk</a>
<img src="https://raw.githubusercontent.com/yzeaho/BottomPushPopWindow/master/1448714621.gif">

#How to Use
继承BottomPushPopupWindow，编写generateCustomView添加自定义的view，调用showAtLocation方法显示。
