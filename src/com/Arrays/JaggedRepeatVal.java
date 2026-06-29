package com.Arrays;

public class JaggedRepeatVal {

	public static void main(String[] args) {

		        int[][] arr = new int[3][];
		        arr[0] = new int[2];
		        arr[1] = new int[1];
		        arr[2] = new int[2];
		        
		        
		        arr[0][0] = 4;
		        arr[0][1] = 3;
		        
		        arr[1][0] = 0;
		        
		        arr[2][0] = 4;
		        arr[2][1] = 0;
		       
		        System.out.println("Repeated numbers:");

		        for (int i = 0; i < arr.length; i++) {
		            for (int j = 0; j < arr[i].length; j++) {

		                int count = 0;

		                // Count occurrences of arr[i][j]
		                for (int k = 0; k < arr.length; k++) {
		                    for (int l = 0; l < arr[k].length; l++) {
		                        if (arr[i][j] == arr[k][l]) {
		                            count++;
		                        }
		                    }
		                }

		                // Print only once if repeated
		                boolean alreadyPrinted = false;

		                for (int m = 0; m < i; m++) {
		                    for (int n = 0; n < arr[m].length; n++) {
		                        if (arr[m][n] == arr[i][j]) {
		                            alreadyPrinted = true;
		                        }
		                    }
		                }

		                if (count > 1 && !alreadyPrinted) {
		                    System.out.println(arr[i][j]);
		                }
		            }
		        }
		    }
		}
	