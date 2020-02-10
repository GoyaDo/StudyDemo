package com.elevengeek.goya.entity;

/**
 * @author cj
 * @create 2020-02-10-17:59
 */
public class Person {

    private String name;

    private Integer age;

    public String category;

    public Person() {
    }

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, Integer age, String category) {
        this.name = name;
        this.age = age;
        this.category = category;
    }

    public void eat(){
        System.out.println("eat...");
    }

    public void eat(String name){
        System.out.println(name+"会吃饭...");
    }

    public String sleep(String name){
        System.out.println(name+"会睡觉");
        return name;
    }

    private void study(){
        System.out.println("会学习");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", category='" + category + '\'' +
                '}';
    }
}
