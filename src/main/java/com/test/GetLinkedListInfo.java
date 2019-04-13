package com.test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class GetLinkedListInfo {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> clazz=Class.forName("java.util.LinkedList");
        //获取包名
        String pkgName=clazz.getPackage().getName();
        //获取类名
        String className=clazz.getSimpleName();
        //修饰符
        int mod = clazz.getModifiers();
        String modString = Modifier.toString(mod);
        if (Modifier.isInterface(mod)){
            System.out.println(modString+""+className);
        }else{
            System.out.println(modString+""+className);
        }

        //父类
        Class<?> superClz=clazz.getSuperclass();
        //接口
        Class<?>[] ifs=clazz.getInterfaces();
        //获得属性

        Field[] fields=clazz.getDeclaredFields();
        for (Field field:fields) {
            System.out.println(field.getModifiers()+""+field.getType()+""+field.getName());
        }
        //方法
        Method[] methods=clazz.getDeclaredMethods();
        for (Method method:methods) {
            method.getModifiers();

        }
    }
}
