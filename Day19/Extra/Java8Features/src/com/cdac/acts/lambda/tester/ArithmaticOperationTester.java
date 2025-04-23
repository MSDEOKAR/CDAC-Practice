package com.cdac.acts.lambda.tester;

import com.cdac.acts.lambda.ArithmaticOperations;
import com.cdac.acts.lambda.Operation;
public class ArithmaticOperationTester {

	public static void main(String[] args) {

		//Add 2 numbers using Anonymous Inner class
		double result = ArithmaticOperations.arithmaticOperation(
				10.20, 20.30, new Operation<Double>() {

					@Override
					public Double operate(Double a, Double b) {
						return a + b;
					}
				});

		System.out.println("Sum =" + result);


		//Add 2 numbers using Anonymous Inner class
		double result1 = ArithmaticOperations.arithmaticOperation(
				10.20, 20.30, new Operation<Double>() {

					@Override
					public Double operate(Double a, Double b) {
						return a * b;
					}
				});

		System.out.println("Multiplication =" + result1);


	}

}
