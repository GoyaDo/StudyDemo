package com.elevengeek.goya.reflect;

import com.elevengeek.goya.anno.Pro;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @author cj
 * @create 2020-02-10-20:58
 */
public class ReflectDemo {
    public static void main(String[] args) throws Exception {
        //1.加载配置文件
        //创建properties对象
        Properties properties = new Properties();
        //加载配置文件，转换为一个集合
        //获取classpath目录下的配置文件
        ClassLoader classLoader = ReflectDemo.class.getClassLoader();
        InputStream inputStream = classLoader.getResourceAsStream("pro.properties");
        properties.load(inputStream);

        //获取配置文件中定义的数据
        String className = properties.getProperty("className");
        String methodName = properties.getProperty("methodName");

        //加载该类进内存
        Class clazz = Class.forName(className);
        Object o = clazz.newInstance();
        //获取方法对象
        Method method = clazz.getMethod(methodName);
        method.invoke(o);
    }
}
