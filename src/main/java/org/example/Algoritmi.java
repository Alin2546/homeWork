
package org.example;

import org.apache.commons.math3.primes.Primes;

import java.util.*;

/**
 * This is a testClass.
 * <p>
 * A simple class with 5 different methods(This is a HomeWork!).
 * </p>
 *
 * @author Alin
 * @version 1.0
 */
public class Algoritmi {
    /**
     * Displays the sum of the numbers in the range [1,100].
     */
    public static void sumOf100Numbers() {
        System.out.println(100 * (100 + 1) / 2);
    }

    /**
     * Displays the minimum element from an array of integers.
     *
     * @param arr an array of integers to search for the minimum value
     */
    public static void minimumElementFromArray(int[] arr) {
        Arrays.sort(arr);
        System.out.println(arr[0]);
    }

    /**
     * Displays the maximum digit found in an integer.
     *
     * @param n a positive integer from which the maximum digit will be found
     */
    public static void displayMaxDigit(int n) {
        char[] ch = String.valueOf(n).toCharArray();
        Arrays.sort(ch);
        System.out.println(ch[ch.length - 1]);
    }

    /**
     * Check if an integer is palindrome displaying the boolean value accordingly.
     *
     * @param n a positive integer which will be checked if it is a palindrome
     */
    public static void checkIfPalindrome(int n) {
        System.out.println(String.valueOf(n).equals(String.valueOf(new StringBuilder(String.valueOf(n)).reverse())));
    }

    /**
     * Displays the primality in the range [0, n).
     * <p>
     * It uses an external class Primes which have a method isPrime to check for primality.
     * This method comes from an Math dependency from maven repository (org.apache.commons.math3.primes.Primes).
     * </p>
     *
     * @param n a positive integer which is the ending point of the range (exclusive)
     */
    public static void displayPrimeNumbers(int n) {
        int i = 0;
        while (i != n) {
            if (Primes.isPrime(i)) {
                System.out.print(i + " ");
            }
            i++;
        }
    }

    /**
     * Entry point to test the 5 methods from the Algoritmi class.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        sumOf100Numbers();
        minimumElementFromArray(new int[]{30, 40, 20, 10, 50});
        displayMaxDigit(743284);
        checkIfPalindrome(1221);
        displayPrimeNumbers(100);
    }
}

