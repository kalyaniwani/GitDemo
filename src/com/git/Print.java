package com.git;

public class Print {
	
	
	public static  void print(int n) {
		
		if(n>0) {
			print(n-1);
			System.out.print(n+++" ");
		}
	}
	
	public static void print1(int n) {
		
		if(n>0) {
			System.out.print(n+" ");
			print1(n-1);
		}
	}
	public static void main(String[] args) {
		
		print1(100);
		print(100);
	}

}
