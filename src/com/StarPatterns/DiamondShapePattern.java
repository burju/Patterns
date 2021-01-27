package com.StarPatterns;
/*Do the following : 	
     *
    ***
   *****
  *******
 *********
  *******
   *****
    ***
     *
*/

import java.util.Scanner;
public class DiamondShapePattern {
	public static void main(String[] args) {
	Scanner input= new Scanner(System.in);
<<<<<<< Updated upstream
	System.out.println("Please enter the number of lines you want to display in your pattern below");
=======
	System.out.println("Please enter the number of lines you want to display in your pattern");
	System.out.println("use loops here");
>>>>>>> Stashed changes
	int lines= input.nextInt();
	String space=" _";
	String star=" *";
	for (int i = 0, k=lines; i < lines && k>0; i++, k--) {
		 for (int j = 0; j < k ; j++) {
			System.out.print(space);
		}
		 System.out.println(star);
		 star+=  " * *";
	}
	System.out.println("----PRINTING SECOND HALF NOW-----");
	//printing space
	for (int i = 0; i < lines; i++) {
		System.out.println(space);
		space+="_";
	}
		
	// printing stars
	 
	for (int i = 0, k=lines ; i < (lines-1 )&& k>0; i++, k--) {
	  
	   for (int j = 0; j < k ; j++) {
		    star.substring(0, (star.length()-1));
			System.out.println(star);
			
	}
	}
	}
	}
	
	
	


