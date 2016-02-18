/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson9.Prob1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;


public class prob1_c {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(3, 4, 5, 1, 1, 9, 0);
        
        System.out.println("Min:" + getIntStream(list).min(Integer::compare).get());
        System.out.println("Max:" + getIntStream(list).max(Integer::compare).get());
    }

    public static Stream<Integer> getIntStream(List list) {
        return list.stream();
    }

}
