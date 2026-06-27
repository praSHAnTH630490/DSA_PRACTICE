package com.Happy;
import java.util.Scanner;
public class Bank {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		int balance = 2000;
		System.out.println("enter the ammount to withdraw: ");
		int amount = sc.nextInt();
		if (balance>=amount) {
			System.out.println("successfull");
		}
		else {
			System.out.println("failed");
		}
		

	}

}
