package com.StarPatterns;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;
/*
    * 
   * * 
  * * * 
 * * * * 
* * * * *
*/
public class PyramidPattern {
public static void main(String[] args) {
	Scanner input= new Scanner(System.in);
	System.out.println("Please enter the number of lines you want to display in your pattern");
	int lines= input.nextInt();
	String space=" ";
	String star=" *";
	
	for (int i = 0 ; i <lines ; i++) {

		for (int j2 = 0; j2 <lines-i; j2++) {
			System.out.print(space);
		}
		
		System.out.print(star);
		star+=" *";
		System.out.println();
	}

}
}
