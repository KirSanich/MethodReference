package com.company;

public class Person<T> {
    private T name;
    private T age;

    public Person(T name, T age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }

    public Person(T name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name=" + name +
                ", age=" + age +
                '}';
    }
}
