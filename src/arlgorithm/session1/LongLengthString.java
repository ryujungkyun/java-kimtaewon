package arlgorithm.session1;

import java.util.Scanner;

public class LongLengthString {

    private static String solution(String input) {
        String[] splitedString = input.split(" ");
        String result = "";
        for (String str : splitedString) {
            if (str.length() > result.length()) {
                result = str;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(solution(input));
    }
}
