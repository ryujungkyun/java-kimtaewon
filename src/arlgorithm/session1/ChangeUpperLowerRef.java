package arlgorithm.session1;

import java.util.Scanner;

public class ChangeUpperLowerRef {

    public static String solution(String str) {
        StringBuilder answer = new StringBuilder();
        for (char x : str.toCharArray()) {
            if (Character.isLowerCase(x)) {
                answer.append(Character.toUpperCase(x));
            }
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

    }
}
