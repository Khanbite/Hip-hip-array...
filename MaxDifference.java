/*
Name: Khani Lyan
Date: 10/2/2025
Description: This program finds the max difference in a user-defined array of variable length.
*/
import java.util.Arrays;
import java.util.Scanner;

public class MaxDifference {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter numbers: ");

        for (int i = 0; i < 15; i++) {
            userNums[i] = input.nextInt();
        }

    }
    public static int maxDifference(int... userList) {
        int max = userList[0];
        int min = userList[0];

        for (int num : userList) {
            if (num > max) max = num;
            if (num < min) min = num;
        } System.out.println(max);
        System.out.println(min);
        return max - min;
    }
}
