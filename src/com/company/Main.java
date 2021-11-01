package com.company;


import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        //Вариант, когда нужна разовая логика
        List<Integer> list = new ArrayList<>(List.of(6, 9, 1, 0));
        System.out.println(listResult(list, list1 -> list1.subList(0, 2)));


        // Вариант, когда есть готовая логика, но в методе и указывается ссылка на метод
        List<String> list1 = new ArrayList<>(List.of("Kirill", "Oleg", "Herk", "Jork"));
        System.out.println(listResult(list1, Main::someListActions));


        ReferenceConstructor<Person<String>, String> personStringReferenceConstructor = Person::new;
        System.out.println(FactoryClass(personStringReferenceConstructor, "Kiri7", "Keys"));


    }

    public static <T> List<T> listResult(List<T> list, FuncInterface<T> funcInterface) {
        return funcInterface.someOperation(list);
    }

    public static <T> List<T> someListActions(@NotNull List<T> list) {
        return list.subList(0, 2);
    }


    public static <R, T> R FactoryClass(ReferenceConstructor<R, T> referenceConstructor, T value, T value2) {
        return referenceConstructor.constructor(value, value2);
    }


}

