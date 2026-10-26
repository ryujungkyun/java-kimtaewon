package Test;

import java.util.Scanner;

public class PalindromeString {


    private static String solution(String input) {
        String answer = "";
        input = input.toUpperCase();
        for (char x : input.toCharArray()) {
            if (Character.isAlphabetic(x)) {
                answer += x;
            }
        }

        StringBuilder sb = new StringBuilder(answer);
        String reverseStr = sb.reverse().toString();
        if (answer.equals(reverseStr)) {
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
