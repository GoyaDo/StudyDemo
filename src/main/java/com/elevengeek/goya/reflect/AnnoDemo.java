package com.elevengeek.goya.reflect;

import com.elevengeek.goya.anno.Pro;

/**
 * @author cj
 * @create 2020-02-10-22:25
 */
@Pro(className = "com.elevengeek.goya.entity.Person",methodName = "eat")
public class AnnoDemo {
    public static void main(String[] args) {
        //解析注解
        //获取该类的字节码文件对象
        Class<AnnoDemo> annoDemoClass = AnnoDemo.class;
        //获取上面的注解对象
        //其实在内存中生成了一个该注解接口的子类实现对象,并且实现了注解里的方法
        Pro annotation = annoDemoClass.getAnnotation(Pro.class);
        /*
        public class ProImpl implements Pro{
            public String className(){
                return "com.elevengeek.goya.entity.Person"
            }
            public String methodName(){
                return "eat"
            }
        }
         */
        //调用注解对象中定义的抽象方法，获取返回值
        String className = annotation.className();
    }
}
