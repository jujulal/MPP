package Lesson8.Demo.functionalprogramming;

import java.util.function.BiFunction;

public class FactorialFunctional2 {
	public static final BiFunction<Integer, Integer, Double> f = (x,y)->Math.pow(x,y);
	
	public static void main(String[]arg){
		//System.out.println("Power of 2 of 3 is: " + f(2,3));
	}
}
