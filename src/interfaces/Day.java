
package interfaces;
import java.util.*;
interface Car{
	public void display(int a, int b);
}
public class Day implements Car{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
		int n = sc.nextInt();
		int m = sc.nextInt();
	Day d = new Day();
	d.display(n,m);
	}
		catch(InputMismatchException e) {
			System.out.println("Enter numbers only");
		}
	}

	@Override
	public void display(int a , int b) {
		try {
		int c = a/b;
		System.out.println(c);
		}
        
		catch(Exception e) {
			System.out.println("Enter non zero");
		}
		finally {
			System.out.println("Program is Over");
		}
	
	}

	
}
