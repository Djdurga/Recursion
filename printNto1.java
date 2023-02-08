package com.diya;

public class printNto1 {
	static void num(int n) {
		if(n == 0) {
		   return ;
		}
		System.out.println(n + " ");
		num(n - 1);
	}
	public static void main(String[] args) {
		int n = 6;
		num(n);
	}

}

//output: 6 5 4 3 2 1
