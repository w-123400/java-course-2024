package org.ethz.day4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

public class VowelConsonantCounter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Set of vowels
        Set<Character> vowels = new HashSet<>();
        for (char c : "AEIOU".toCharArray()) {
            vowels.add(c);
        }

        System.out.print("Enter the name of the text file: ");
        String filename = scanner.nextLine();

        int vowelCount = 0;
        int consonantCount = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            int ch;
            while ((ch = reader.read()) != -1) {
                char character = Character.toUpperCase((char) ch);
                if (Character.isLetter(character)) {
                    if (vowels.contains(character)) {
                        vowelCount++;
                    } else {
                        consonantCount++;
                    }
                }
            }

            System.out.println("Number of vowels: " + vowelCount);
            System.out.println("Number of consonants: " + consonantCount);
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}
