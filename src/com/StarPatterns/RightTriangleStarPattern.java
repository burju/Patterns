package com.StarPatterns;

import java.util.Scanner;

/*
 * . Right Triangle Star Pattern

*
* *
* * *
* * * *
* * * * *
 
 */
public class RightTriangleStarPattern {
public static void main(String[] args) {
	Scanner input= new Scanner(System.in);
	System.out.println("Please enter the number of lines you want to display in your pattern");
	int lines= input.nextInt();
	String star=" *";
	
	for (int  j= 0;  j< lines; j++) {
		System.out.println(star);
		star+= " *";
	}
	}
}

