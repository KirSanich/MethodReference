package com.company;


@FunctionalInterface
public interface ReferenceConstructor<R,T> {
    R constructor(T s, T s1);
}
