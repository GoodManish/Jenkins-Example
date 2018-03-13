package com.techprimers.testing;

public class FizzBuzz {

	public String play(int number) {
		System.out.println("FizzBuzz play() called....");
		
		if (number == 0)
			throw new IllegalArgumentException("Number must not be 0");
		if (number % 3 == 0)
			return "Fizz";
		if (number % 5 == 0)
			return "Buzz";

		System.out.println("Change After 1st commit in master branch");
		return String.valueOf(number);
	}
}
