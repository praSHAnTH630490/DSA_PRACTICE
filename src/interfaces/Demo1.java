package interfaces;
import java.util.*;
class  InsufficientMemoryException extends Exception { 

	private static final long serialVersionUID = 1L;

	InsufficientMemoryException(String s){
		super(s);
	}
}
class Demo1 {
	Demo1(){
		System.out.println("This is your memory space: ");
	}
   private Object num;
   public void memory(Object num) {
	   int fullMemory = 2000;
	  Scanner sc = new Scanner(System.in);
	  int n = sc.nextInt();
	  if(n<fullMemory) {
		  System.out.println(fullMemory-n);
	  }
	  else {
		  try {
		  throw new  InsufficientMemoryException("Not enough memory");
	  }
		  catch(Exception e) {
			  System.out.println(e);
		  }
	  }
   }
	public static void main(String[] args) {
		Demo1 n = new Demo1();
         n.memory(n);
	}

}
