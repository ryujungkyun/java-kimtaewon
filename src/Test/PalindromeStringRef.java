package Test;

import java.util.Scanner;

public class PalindromeStringRef {


    private static String solution(String input) {
        input = input.toUpperCase().replaceAll("[^A-Z]", "");

        for (int i = 0; i < input.length() / 2 ; i++){
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                return "NO";
            }
        }
        return "YES";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(solution(input));

    }
}
