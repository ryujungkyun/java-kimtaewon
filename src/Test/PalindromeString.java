package Test;

import java.util.Scanner;

public class PalindromeString {

    private static String solution(String input) {
        input = input.toUpperCase();
        StringBuilder answer = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (Character.isAlphabetic(c) ) {
                answer.append(c);
            }
        }
        String origin = answer.toString();
        String reverseStr = answer.reverse().toString();
        if (origin.equals(reverseStr)) {
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
