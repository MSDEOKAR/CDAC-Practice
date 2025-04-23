package com.captcha;

import java.util.Scanner;

public class CaptchaReader {

	public static void main(String[] args) {

		double captcha = 0.0;
		double d = 0.0;
		Scanner scanner = new Scanner(System.in);

		do {
			captcha = Math.random();
			System.out.println("\n Captcha=" + captcha);
			
			System.out.println("\n Please enter captcha");
			d = scanner.nextDouble();

		} while(captcha != d);
		System.out.println("\n Congrats correct captcha entered");
		
		scanner.close();

	}
}
