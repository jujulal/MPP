/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson9.Prob1;

import java.util.stream.Collectors;
import java.util.stream.Stream;


public class prob1_b {

    public static void main(String[] args) {

        Stream<String> stringStream = Stream.of("Bill", "Thomas", "Mary");
        System.out.println(stringStream.collect(Collectors.joining(",")));

    }

}
