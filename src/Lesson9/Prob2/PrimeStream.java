package Lesson9.Prob2;

import java.math.BigInteger;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimeStream {

	private static boolean isPrime(int num) {

		if(num==2) return true;
	        if(num%2==0) return false;
	        for (int i = 3; i * i <= num; i += 2)
	            if (num % i == 0) return false;
	        return true;
	}
	
	public void printFirstNPrimes(long num){
		final Stream<BigInteger> primes = IntStream.iterate(1,n->n+1)
		.filter(n->(PrimeStream.isPrime(n))).boxed().map(x->BigInteger.valueOf(x)).limit(num);
		
		List<BigInteger> primeList = primes.collect(Collectors.toList());
		System.out.println(primeList);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimeStream ob = new PrimeStream();
		
		ob.printFirstNPrimes(5);
		
		ob.printFirstNPrimes(15);
	}

}
