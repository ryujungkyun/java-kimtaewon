package Test;

import java.util.Scanner;

public class PalindromeStringRef {

    private static String solution(String input) {
        input = input.toUpperCase().replaceAll("[^A-Z]", "");
        StringBuilder sb = new StringBuilder(input);
        String reverseStr = sb.reverse().toString();

        if (input.equals(reverseStr)) {
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
