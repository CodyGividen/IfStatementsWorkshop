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
//        Scanner input = new Scanner(System.in);
//        System.out.println("Start");
//        int userNumber = input.nextInt();

        // OR

//        int userNumber = (0);
//        while (userNumber < 100) {
//            userNumber = (userNumber + 1);

//            if ((userNumber % 5 == 0) && (userNumber % 3 == 0)) {
//                System.out.println("FizzBuzz");
//            } else if (userNumber % 3 == 0) {
//                System.out.println("Fizz");
//            } else if (userNumber % 5 == 0) {
//                System.out.println("Buzz");
//            } else {
//                System.out.println(userNumber);
//            }
//        }
//    }
//}


//TO DO FIZZ BUZZ IN LOOP


//    int userNumber = input.nextInt();
//
//    for ( int i = 1; i <= 100 ; i++) {
//        if (i % 3 == 0 && i % 5 == 0){
//            System.out.println("FIZZ BUZZ");
//            }else if (i % 3 == 0){
//            System.out.println("FIZZ");
//            }else if (i % 5 == 0){
//            System.out.println("BUZZ");
//            } else {
//                System.out.println(i);
//            }
//            }
        Scanner input = new Scanner(System.in);
        System.out.println("Grade");
        int grade = input.nextInt();

        if (grade == (grade >= 90)) {
            System.out.println("A");
        } else if (grade == (89 >= 80)) {
            System.out.println("B");
        } else if (grade == (79 >= 70)) {
            System.out.println("C");
        } else if (grade == (69 >= 60)) {
            System.out.println("D");
        } else {
            System.out.println("You Failed");
        }


    }
}