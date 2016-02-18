package Lesson11.Demo.GenericInterface;

public class MyPair2<K,V> implements Pair{
	private K key;
	public V value;
	
	MyPair2(K s, V d){
		this.key = s; this.value=d;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyPair2 p1 = new MyPair2("abc",34.5);
		
		System.out.println(p1);
	}

	@Override
	public K getKey() {
		// TODO Auto-generated method stub
		return key;
	}

	@Override
	public V getValue() {
		// TODO Auto-generated method stub
		return value;
	}
	@Override
	public String toString(){
		return getKey()+" " + getValue();
	}

}
