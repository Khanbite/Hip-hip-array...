/*
Name: Khani Lyan
Date: 10/2/2025
Description: This program splits an array of 15 user-assigned numbers into odds and evens, in their own separate lists.
*/
import java.util.Scanner;

public class EvenOddSplitter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] userNums = new int[15];
        System.out.println("Enter 15 integers with one space between each integer: ");

        for (int i = 0; i < 15; i++) {
            userNums[i] = input.nextInt();
        }

        int[] evens = getEvens(userNums);
        int[] odds = getOdds(userNums);

        System.out.print("Even numbers: ");
        for (int i : evens) {
            if (i != 0) {
                System.out.print(i + " ");
            }
        } System.out.println();

        System.out.print("Odd numbers: ");
        for (int i : odds) {
            if (i != 0) {
                System.out.print(i + " ");
            }
        } System.out.println();
    }
    public static int[] getEvens(int[] i) {
        int[] evens = new int[i.length];
        int index = 0;
        for (int x : i) {
            if (x % 2 == 0) {
                evens[index++] = x;
            }
        }
        return evens;
    }
    public static int[] getOdds(int[] i) {
        int[] evens = new int[15];
        int index = 0;
        for (int x : i) {
            if (x % 2 == 1) {
                evens[index++] = x;
            }
        }
        return evens;
    }
}
