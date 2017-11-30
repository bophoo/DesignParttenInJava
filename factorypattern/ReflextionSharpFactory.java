package com.bophoo.factorypattern;

/**
 * 图形工厂，根据图形类型返回对应图形类
 */
public class ReflextionSharpFactory {
    public static Object getSharp(Class<?extends Sharp>  clazz ) {
        try {
            Object instance = Class.forName(clazz.getName()).newInstance();
            return instance;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
        return null;
    }
}
