package Lesson9.Prob2;

import java.math.BigInteger;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class Problem2 {
	
	private static boolean isPrime(int num) {
       // if (num.equals(BigInteger.valueOf(2)) ) return true;
        //if (num.mod(BigInteger.valueOf(2)).equals(BigInteger.ZERO)) return false;
        
        //for(BigInteger j=BigInteger.ONE;j.multiply(j).compareTo(num).;)
        if(num==2) return true;
        if(num%2==0) return false;
        for (int i = 3; i * i <= num; i += 2)
            if (num % i == 0) return false;
        return true;
}
	
	public void displayPrimes(){
		//call the isPrime method in place of n+1
		//IntStream primes = IntStream.iterate(1,n->isPrime(n)).limit(50)
		
		 Stream<BigInteger> primes = IntStream.iterate(1,n->n+1).limit(1150)
		//Stream<BigInteger> primes = Stream.iterate(BigInteger.ONE,n->n.add(BigInteger.ONE)).limit(1150)
				
				 .filter(n->(Problem2.isPrime(n))).boxed().map(x->BigInteger.valueOf(x));
		 //Stream<BigIntege> bigPrimes = primes.map((x)->BigInteger.valueOf(x));//.collect(Collectors.toList());
				 //.filter(predicate)
				
				
				
		List<BigInteger> primeList = primes.collect(Collectors.toList());
		System.out.println(primeList);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Problem2 obj = new Problem2();
		obj.displayPrimes();
	}

}
