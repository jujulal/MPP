package Lesson9.Prob6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class UnionSet {
	public static Set<String> union(List<Set<String>> sets){
		
		 //Set<String> newSet = new HashSet<String>(); 
		//		newSet.addAll(sets.stream().reduce());
			return sets.stream().reduce((t,u)->{t.addAll(u);return u;}).get();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set1 = new LinkedHashSet<String>();
			set1.add("A");
			set1.add("B");
		Set<String> set2 = new LinkedHashSet<String>();
			set2.add("D");
		Set<String> set3 = new LinkedHashSet<String>();
			set3.add("1");
			set3.add("3");
			set3.add("5");
			
		List<Set<String>> aSets = new ArrayList<>();
		aSets.add(set1);
		aSets.add(set2);
		aSets.add(set3);
		
		System.out.println(aSets);
		
		System.out.println("After conversion:" + union(aSets));
		
	}

}
