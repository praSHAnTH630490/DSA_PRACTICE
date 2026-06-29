package com.construct;
import java.util.*;
public class Constructors {
  public void print(int n) {
	  int i;
	  int[] age = new int[n];
  for(i =0 ;i<age.length ; i++) 
  {
	  Scanner sc = new Scanner(System.in);
  age[i] = sc.nextInt();
  
  }
  
  System.out.println("Array elelments are: "+Arrays.toString(age));
  }
	public static void main(String[] args) {
		Constructors c = new Constructors();
		c.print(10);
		
	}

}
