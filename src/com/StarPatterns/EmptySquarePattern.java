package com.StarPatterns;
/*
$$$$
$  $
$  $
$$$$
*/

public class EmptySquarePattern { 

public static void main(String[] args) {
	int line=4; 
	for (int i = 0; i <line; i++) {
		for (int j = 0; j <line; j++) {
		    if( i==0 || i==(line-1)) {
			   System.out.print(" $");
		} 
		    		    
		    else if((j==0) || j== (line-1) ) {
		    	System.out.print(" $");
		    }
		    else if( (j>0) || j<(line-1)){
		    	System.out.print("  ");
		    }
		   }
		System.out.println();
		
	}
	
	
	}
	

}
