package com.StarPatterns;

import java.util.Scanner;

/*
 *     
         * 
       * * 
     * * * 
   * * * * 
 * * * * * 

 */
public class LeftTriangleStarPattern {
	
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Please enter the number of lines you want to display in your pattern");
		int lines= input.nextInt();
		String space=" ";
		String star=" *";
		
		for (int i = 0, j=lines-1; i < lines && j>0; i++, j--) {
			for (int k =0 ; k<(j*2) ; k++) {
				System.out.print(space);
			}
			System.out.println(star);
			star+= " *";
		}
		
	}

}
