package com.StarPatterns;

public class KShapePattern {
	public static void main(String[] args) {
		for (int i = 1; i < 7; i++) {
			for (int j = 1; j <=  8 - i; j++) {
				System.out.print(j+ " ");
			}
			System.out.println();
		}
		String numbers="1";
		
		for (int i = 1; i < 8; i++) {
			for (int j = 1; j <= i; j++) {
			System.out.print(j+ " ");
			}
			System.out.println();
			}

		}

}
