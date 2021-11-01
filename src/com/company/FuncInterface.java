package com.company;

import java.util.List;

@FunctionalInterface
public interface FuncInterface<T> {

   List<T> someOperation(List<T> list);
}
