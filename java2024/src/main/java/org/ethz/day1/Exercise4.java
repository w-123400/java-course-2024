package org.ethz.day1;

import java.util.Scanner;

public class Exercise4 {

public static void main(String[] args) {

    final double pi = 3.14159;

    Scanner input = new Scanner(System.in);
    System.out.println("Input the radius of the circle: ");

    double radius = input.nextDouble();
    
    double result = pi * radius * radius;

    System.out.println("area of the circel is eqaul to: " + result);
    input.close();
}


}
