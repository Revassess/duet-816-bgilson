package com.revature.tier1;

public class NumberSumLength {

	public static boolean checkNumberPowerLength(long num) {
		long myNum = num;
		int length = String.valueOf(num).length();
		long sum = 0;
		long digit = 0;
		
		for(int i=1; i<=length; i++) {
			digit = (myNum % (long) Math.pow(10, i)) / (long) Math.pow(10, i-1);
			sum += Math.pow(digit,length);
			myNum -= digit*Math.pow(10, i-1);
		}
		
		if (sum == num) {
			return true;
		}
		else {
			return false;
		}
	}
}
