package arlgorithm.session1;

import java.util.Scanner;

public class PalindromeString {

    public static String solution(String str) {
        str = str.toUpperCase();

        StringBuilder sb = new StringBuilder();
        char[] charArray = str.toCharArray();

        for (char x : charArray) {
            if (Character.isAlphabetic(x)) {
                sb.append(x);
            }
        }
        String origin = sb.toString();
        String reverse = sb.reverse().toString();
        if (origin.equals(reverse)) {
            return "YES";
        } else {
            return "NO";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(solution(input));
    }
}
