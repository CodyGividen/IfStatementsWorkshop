package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/*     if (condition = daytime) {
	leave house
	else if{
	stay home
First if statement that is true will be the statement that will be followed.
	fizzbuzz- take user input of 1 to 100,
	if it is a multiple of 3 output fizz
	if it is a multiple of 5 output buzz
	if it is a multiple of both output fizzbuzz
	if it is none of these output their number
	 */
        Scanner input = new Scanner(System.in);
        System.out.println("Start");
        int userNumber = input.nextInt();

        if ((userNumber % 5 == 0) && (userNumber % 3 == 0)) {
            System.out.println("FizzBuzz");
        }
            else if (userNumber % 3 == 0)
        {
            System.out.println("Fizz");
        }
            else if (userNumber % 5 == 0){
            System.out.println("Buzz");
        }
            else {
            System.out.println(userNumber);
        }
    }
}
