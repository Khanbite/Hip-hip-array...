/*
Name: Khani Lyan
Date: 10/2/2025
Description: This program finds the max difference in a user-defined array of variable length.
*/
import java.util.Scanner;

public class MaxDifference {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter numbers separated by spaces: ");

        String line = input.nextLine();
        String[] individual = line.split(" ");

        int[] userNums = new int[individual.length];
        for (int i = 0; i < individual.length; i++) {
            userNums[i] = Integer.parseInt(individual[i]);
        }

        int difference = maxDifference(userNums);
        System.out.println("Max difference: " + difference);
    }

    public static int maxDifference(int... userList) {
        int max = userList[0];
        int min = userList[0];

        for (int num : userList) {
            if (num > max) max = num;
            if (num < min) min = num;
        }
        return max - min;
    }
}
