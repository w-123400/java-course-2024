package org.ethz.day2;


import java.util.Scanner;
import java.util.Arrays;

public class Exercise3 {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter three cities
        System.out.print("Enter the first city: ");
        String city1 = scanner.nextLine();

        System.out.print("Enter the second city: ");
        String city2 = scanner.nextLine();

        System.out.print("Enter the third city: ");
        String city3 = scanner.nextLine();

        // Store the cities in an array
        String[] cities = { city1, city2, city3 };

        // Sort the array in ascending order
        Arrays.sort(cities);

        // Display the cities in ascending order
        System.out.println("The cities in ascending order are:");
        for (String city : cities) {
            System.out.println(city);
        }

        // Close the scanner to prevent resource leak
        scanner.close();
    }



}
