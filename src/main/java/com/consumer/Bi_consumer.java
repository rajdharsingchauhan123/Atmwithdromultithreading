package com.consumer;

import java.util.function.BiConsumer;

public class Bi_consumer {
    public static void main(String[] args) {
        BiConsumer<Integer,Integer>addtwo=(x,y)-> System.out.println(x+y);
        addtwo.accept(3,5);
        BiConsumer<Integer,Integer>multiple =(a,b)-> System.out.println(a*b);


        multiple.accept(456,345);
        addTwo(1, 2, (x, y) -> System.out.println(x + y));          // 3
        addTwo("Node", ".js", (x, y) -> System.out.println(x + y)); // Node.js



        math(1, 1, (x, y) -> System.out.println(x + y));   // 2
        math(1, 1, (x, y) -> System.out.println(x - y));   // 0
        math(1, 1, (x, y) -> System.out.println(x * y));   // 1
        math(1, 1, (x, y) -> System.out.println(x / y));   // 1

    }

    static <T> void addTwo(T a1, T a2, BiConsumer<T, T> c) {
        c.accept(a1, a2);}


        static <Integer> void math(Integer a1, Integer a2, BiConsumer<Integer, Integer> c) {
            c.accept(a1, a2);
        }


    }


