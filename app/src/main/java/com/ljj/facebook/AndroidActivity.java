package com.ljj.facebook;

import android.support.v7.app.AppCompatActivity;

/**
 * Created by lijiajun on 2018/3/18.
 */

/**
 * Android面试题
 */
public class AndroidActivity extends AppCompatActivity {
    private void androidFace() {
        /**
         * 四大组件是什么
         */
        // Activity:与用户交互界面
        // Service:一个服务，没有界面，运行于后台
        // Content Provider: 允许第三方访问曝露出的数据
        // BroadCast Receiver: 对外部事件进行过滤，只对感兴趣的内容进行接收并做出响应

        /**
         * 四大组件的生命周期和简单用法
         */
        //Activity:onCreate()->onStart()->onResume()->onStop()->onPause()->onDestroy(),onRestart()从onStop()->onStart()
        //Service:1)startService:onCreate()->onStartCommond()->onDestroy()
        //        2)bindService:onCreate()->onBind()->onUnbind()->onDestroy(),onRebind()从onUnbind()->onBind()后面，不会重新onBind();

        /**
         * Activity,Service,BroadCastReceiver,fragment之间的通信方式
         */
        //Activity之间:回调，intent

        //Activity和Service: Activity传值到service)通过Intent进行传值，onStartCommond(Intent...)中进行接收
        //                                        通过返回binder对象来设置值，在activity中的onServiceConnectioned(IBinder...)设置值;
        //                                        通过回调,先通过IBinder对象来获得Service,再设置回调
        //                   service传值到Activity)通过广播

        //Activity和BroadCastReceiver:通过intent设置，或者使用EventBus

        //Activity和fragment:使用广播)
        //                   使用activity的public方法
        //                   使用EventBus

        /**
         * Activity各种情况下的生命周期
         */
        //A->B :onCreate(A)->onStart(A)->onResume(A)->onStop(A)->onCreate(B)->onStart(B)->onResume(B)->onPause(A)
        //B->A :onStop(B)->onRestart(A)->onStart(A)->onResume(A)->onPause(B)->onDestroy(B)

        /**
         * Activity与Fragment之间生命周期比较
         */
        //Fragment:onAttach()->onCreate()->onCreateView()->onActivityCreated()->onStart()->onResume()->onStop()->onPause()->onDestroyView()->onDestroy()->onDetach()
        //创建过程时，activity先调用；销毁时，fragment先调用

        /**
         * Activity上有Dialog的时候按Home键时的生命周期
         */
        //onStop()->onPasue();(Dialog不影响Activity的生命周期)

        /**
         * 两个Activity 之间跳转时必然会执行的是哪几个方法？
         */
        //onCreate(),onStart(),onResume(),onStop(),onPause(),onSaveInstanceState(),onRestoreInstanceState();

        /**
         * Activity状态保存于恢复
         */

        //onSaveInstanceState(),onRestoreInstanceState();通过Bundle来储存值
        /**
         * Fragment状态保存startActivityForResult是哪个类的方法，在什么情况下使用？
         */
        //Fragment的方法，适用于再Fragment中接受结果，需要再Activity的onActivityResult()中调用super.onActivityResult();

        /**
         * 如何实现Fragment的滑动？
         */
        //ViewPager+fragment

        /**
         * 怎么在Activity 中启动自己对应的Service？
         */
        //将Activity和Service进行绑定

        /**
         * 本地广播和全局广播有什么差别
         */
        //本地广播:只在本APP内传播，不会外泄数据，内部是用handler实现的
        //全局广播:发出的广播可以被任何应用接收，也可以接收任意广播

        /**
         * AlertDialog,popupWindow,Activity区别
         */
        //AlertDialog是非阻塞式对话框，对话框弹出时，后台仍然可以运行
        //popuwindow是阻塞式对话框，弹出时，程序会等待，直到调用dismiss方法

        /**
         * RecycleView的使用
         */
        //下拉刷新，上拉加载原理: 根据是否是最后一项来判断
        //复杂布局原理:   getItemType
        //嵌套事件冲突:
        //内部实现机制:
        //与ListView的区别:

        /**
         * 屏幕适配的处理技巧都有哪些?
         */
        //布局适配:创建多个layout
        //图片适配:多套图
        //尺寸适配:使用dp,必要时创建多个value文件，配置dimens文件里的值
        //动态适配:代码中计算屏幕的宽高，动态设置控件宽高

        /**
         * 怎么去除重复代码？
         */
        //将公用的逻辑写成一个方法，或者工具类

        /**
         *下拉状态栏是不是影响activity的生命周期
         */
        //Android下拉通知栏不会影响Activity的生命周期方法

        /**
         * Bitmap 使用时候注意什么
         */
        //高效的加载大图:设置合适比例(options.inSampleSize)
        //三级缓存


        //Alpha:1字节
        //ARGB_4444:2字节
        //ARGB_8888:4字节
        //RGB_565:2字节
        //Bitmap内存计算:  列：1080*1920像素图，ARGB_8888加载方式：
        //cacheLenth=1080*1920*4
        //1kb=1024字节

        /**
         * ViewPager使用细节，如何设置成每次只初始化当前的Fragment，其他的不初始化？
         */
        //Fragment懒加载，重写setUserVisableHint(),在里面进行网络加载数据(此方法比onCreate()早)最后调用getUserVisableHint()判断

        /**
         * 内存泄露
         */
        //调试：LeakCanary框架,memory
        //原因:长生命周期对象持有短生命周期对象的引用，导致GC在回收短生命周期对象时无法回收
        //handler,AsyncTask,内部类，cusor等

        /**
         * Java多线程引发的性能问题，怎么解决？
         */
        //使用线程池管理
        //SingleThreadExecutor:创建)e=Executor.newSingleThreadExecutor();增加线程)e.execute(runnable);
        //ScheduledThreadPool:具有定时定期执行任务功能的线程池;e.execute(runnable, 1, TimeUnit.SECONDS);

        /**
         * 启动页白屏及黑屏解决？
         */
        //设置启动页窗体背景图

        /**
         * 启动太慢怎么解决
         */
        //设置启动页窗口背景图
        //不要在Application进行耗时的操作,可以自定义一个IntentService，在onHandlerIntent()方法中进行耗时操作
        //不要以静态变量的方式在Application中保存数据

        /**
         * 怎么使APP不卡顿
         */
        //优化布局，防止过度绘制
        //耗时操作尽量在子线程中进行

        /**
         * App启动崩溃异常捕捉
         */
        //在Application中创建UncaughtExceptionHandler,可在回调方法中重启App;

        /**
         * RecyclerView优化
         */
        //快速滑动时不加载图片，滚动停止时判断图片是否未加载，未加载才加载

        /**
         * Bitmap加载大图
         */
        //设置合适的尺寸进行加载(BitmapFactory.Options的inSampleSize);
        //加载多图时，使用三级缓存LruCache,DiskLruCache
        //加载长图时，使用BitmapRegionDecoder,根据onTouch事件


    }

}
