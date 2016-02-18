package Lesson11.Demo.GenericInterface;

public class MyPair implements Pair<String,Double>{
	private String key;
	public Double value;
	
	MyPair(String s, Double d){
		this.key = s; this.value=d;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyPair p1 = new MyPair("abc",34.5);
		
		System.out.println(p1);
	}

	@Override
	public String getKey() {
		// TODO Auto-generated method stub
		return key;
	}

	@Override
	public Double getValue() {
		// TODO Auto-generated method stub
		return value;
	}
	@Override
	public String toString(){
		return getKey()+" " + getValue();
	}

}
