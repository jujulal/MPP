/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson9.Prob1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import static java.util.stream.StreamSupport.intStream;
import static java.util.stream.StreamSupport.intStream;


public class prob1_a {

    public static void main(String[] args) {
        
        IntStream ones = IntStream.generate(()->1).limit(10).distinct();
        ones.forEach(System.out::println);
        Stream<String> stringStream = Stream.of("Bill", "Thomas", "Mary");
        System.out.println(stringStream.collect(Collectors.joining(",")));

        List<Integer> list = Arrays.asList(3, 4, 5, 1, 1, 9, 0);
        
        System.out.println("Min:" + getIntStream(list).min(Integer::compare).get());
        System.out.println("Max:" + getIntStream(list).max(Integer::compare).get());

    }
    
    public static Stream<Integer> getIntStream(List list){
        return list.stream();
    }

}
