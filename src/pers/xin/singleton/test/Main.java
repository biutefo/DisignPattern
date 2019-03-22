package pers.xin.singleton.test;

import pers.xin.singleton.Singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main {


    public static void main(String[] args) throws Exception {
        Class<?> clazz = Class.forName("pers.xin.singleton.Singleton");
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton1 == singleton2);
        //这里要调用getDeclaredConstructor    这里要调用getConstructor只能获得共有的
        Constructor<?> constructor = clazz.getDeclaredConstructor(null);
        constructor.setAccessible(true);
        Object o = constructor.newInstance();
        System.out.println(o.toString());
        System.out.println(singleton1 == o);
    }
}
