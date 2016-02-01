package Lesson9.Prob4;

import java.math.BigInteger;
import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import Lesson9.Prob3.Employee;

public class Squares {
	static Function<Integer,Double> mySquare = n->Math.pow(n,2);
	//static Function<Integer, Double> mySquare = e -> Math.sqrt(e);
	
	public static void printSquare(int num){
		List<Integer> squarList =IntStream.iterate(1,n->n+1).limit(num)
				.map(x->(int)Math.pow(x,2))
				.boxed()
				.collect(Collectors.toList());
		System.out.println(squarList);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printSquare(15);
	}

}
