package com.ljj.facebook;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**
 * java面试题
 */
public class JavaActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void javaFace() {
        /**
         *  java中==和equals和hashCode的区别
         */
        //  ==：      比较内存中存放的地址
        //  equals：  string中比较两个数值是否相等，Object中比较内存中存放的地址
        //  hashCode：比较内存中存放的地址

        // 扩展 hashCode：通过一定的运算规则将数据转化后的值;
        // 比如有一个数组，分为奇数，偶数两个数组；hash是按v%4
        // 重写equals必须重写hashCode；

        /**
         *  int、char、long、short、byte、float、double、boolean各占多少字节数
         */
        // int:4个字节
        // char:2个字节
        // long:8个字节
        // short:2个字节
        // byte:1个字节
        // float:4个字节
        // double:8个字节
        // boolean:1个字节

        /**
         * int与integer的区别
         */
        //int:是基本数据类型，默认值为0
        //integer:是int的包装类，必须实例化，所以默认值为null,且有分配内存地址

        //java中，int值在-128到127会缓存，超过则会自动创建对象，导致内存地址不同

        /**
         * 谈谈对java多态的理解
         */
        // 多态：一对多的关系，一个抽象类，多个实现类的形式。（用一个父类来引用子类对象）
        // 动态绑定技术，执行期间判断引用对象的类型，根据实际类型去调用响应的方法；
        // 好处：可替换性，可扩展性，
        // 弊端：不能使用子类特有的功能，只能使用重写父类方法的内容

        /**
         * String、StringBuffer、StringBuilder区别
         */
        // String：字符串常量，每次拼接都会重新创建对象，适用于少量数据
        // StringBuffer：字符串变量，线程安全，适用于多线程大量数据
        // StringBuilder：字符串变量，线程不安全，适用于单线程大量数据

        // StringBuffer、StringBuilder：初始会创建16个字节缓存区,超出会自动增加缓存区长度
        // StringBuffer：相比StringBuilder多了synchronized关键字

    }

}
