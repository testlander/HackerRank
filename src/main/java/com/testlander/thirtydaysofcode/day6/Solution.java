package com.testlander.thirtydaysofcode.day6;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < num; i++) {
            String s = scanner.nextLine();
            String even = "", odd = "";

            for (int j = 0; j < s.length(); j++) {
                if (j % 2 == 0) {
                    even += s.substring(j, j+1);
                } else {
                    odd += s.substring(j, j+1);
                }
            }
            System.out.println(even + " " + odd);
        }
        scanner.close();
    }
}
