   

import java.util.Scanner;

public class Proj1 {

	private static int n; 

	public static void main(String[] args) {

		System.out.print("enter n: ");
		n = new Scanner( System.in ).nextInt();
    
	
	
		int[] soretedArray; 
		soretedArray  = new int[n];
		for( int k=0; k<n; k++ ) 
		soretedArray[k] = k;	
     
		findNumbers(n,soretedArray);
	}
	 
	 
	 
	public static void findNumbers(int number, int [] soretedArray) {   	
		for (int i = 0; i < soretedArray.length; i++) {
        for (int j = i; j < soretedArray.length; j++) {
            if (soretedArray[i] + soretedArray[j] == n) { 
				System.out.println(soretedArray[i] + "::" + soretedArray[j]);			
				
               
            }
        }
		}
	}
}
  
  
