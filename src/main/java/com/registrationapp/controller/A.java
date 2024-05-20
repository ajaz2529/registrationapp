package com.registrationapp.controller;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class A {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(12, 34, 556,78,11,763,2,3,5,7,13,17);
//        List<Integer> collect = numbers.stream().filter(x->x%2==0).collect(Collectors.toList());
//        System.out.println(collect);
        List<Integer> collect = numbers.stream().filter(x -> IntStream.range(2, x).noneMatch(i -> x % i == 0)).collect(Collectors.toList());
//        boolean b = IntStream.range(2, 12).noneMatch(x -> 12 % x == 0);
//        System.out.println(b);
        System.out.println(collect);
        Function<Integer, String> val= x->"output is "+x;
        String apply = val.apply(10);
        System.out.println(apply);
        Consumer<Integer> consumer = x-> System.out.println(x);
        consumer.accept(12);
        Supplier<Double> supplier= ()->Math.random();
        Double aDouble = supplier.get();
        System.out.println(aDouble);
        List<String> strings = Arrays.asList("john", "ahmed", "bashir");
        List<Boolean> a = strings.stream().map(str -> str.startsWith("a")).collect(Collectors.toList());
        System.out.println(a);

        numbers.stream().filter(A::isPrime).forEach(System.out::print);

    }
   public static boolean isPrime(int num){
        return IntStream.range(2, num).noneMatch(i->num%i==0);
    }

}
