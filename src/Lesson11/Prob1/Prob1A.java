package Lesson11.Prob1;

import java.util.ArrayList;
import java.util.List;

public class Prob1A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> ints = new ArrayList<Integer>();
		ints.add(1);
		ints.add(2);
		//Error on this code is in this bellow line: The List of type Integer cannot be converted
		//into the List of type Number. 
		List<Number> nums = ints;
		nums.add(3);

	}

}
