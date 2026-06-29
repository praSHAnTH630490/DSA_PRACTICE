package interfaces;

public class WrapperDemo {

	public static void main(String[] args) {
		int a = 23;
		int b = 34;
		
		Integer a1 = 23;
		Integer b1 = 34;
		
		System.out.println((a==a1)?"equal":"not equal");
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.SIZE);
		String n = a1.toString();
		System.out.println(Integer.getInteger(n, b1));
		System.out.println(Integer.highestOneBit(a));
		System.out.println(Integer.toBinaryString(b));
	}

}
