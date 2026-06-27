package interfaces;
import java.util.Scanner;
public class MultiC {
	 
		public void Main(){
		Scanner s = new Scanner(System.in);
		try {
		System.out.println("Enter a value: ");
		int a = s.nextInt();
		System.out.println("Enter b value: ");
		int b = s.nextInt();
		System.out.println(a/b);
		
		try {
			int[] arr = {2,3,4,5,4};
			arr[7] = 34;
		}
		catch(ArithmeticException e) {
			System.out.println("inner error");
		}
		finally {
			System.out.println("finally of inner");
		}
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("outer error");
	
	}
		finally {
			System.out.println("finally of outer");
		}

}
public static void main(String[] args) {
	MultiC t = new MultiC();
	t.Main();
}
}
