package com.account.corejava.memorymanagement;

public class SumAndAvgCalculn {
	void sumAndAverage(int a, int b) {
		int sumOfNumbers = sum(a, b); // method call
		double avgOfNumbers = average(sumOfNumbers, 2);

		System.out.println("Sum of two numbers: " + sumOfNumbers);
		System.out.println("Average of two numbers: " + avgOfNumbers);
	}

	private int sum(int d, int e) {
		int sum = d + e;
		return sum;
	}

	private double average(int total, int divident) {
		double avg = total / divident;
		return avg;
	}

}
