package Lesson9.Prob4;

import java.math.BigInteger;
import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Squares {
	//Function<int> squar = n->Math.sqrt(n);
	
	public static void printSquare(int num){
		IntStream squarList =IntStream.iterate(1,n->n+1)
			.filter(n->Math.sqrt(n).map(x->Double::new).intValue().limit(num));
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
