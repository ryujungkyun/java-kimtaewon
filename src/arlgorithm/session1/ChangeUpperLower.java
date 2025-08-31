package arlgorithm.session1;

import java.util.Scanner;

public class ChangeUpperLower {

    private static void solution(char[] charArray, char[] resultArray) {
        for (int i = 0; i < charArray.length; i++) {
            char target = charArray[i];
            if (Character.isLowerCase(target)) {
                resultArray[i] = Character.toUpperCase(target);
            } else {
                resultArray[i] = Character.toLowerCase(target);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] charArray = str.toCharArray();
        char[] resultArray = new char[charArray.length];

        solution(charArray, resultArray);
        String result = String.valueOf(resultArray);
        System.out.println(result);
    }
}
