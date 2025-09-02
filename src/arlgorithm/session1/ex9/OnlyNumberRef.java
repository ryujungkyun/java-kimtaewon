package arlgorithm.session1.ex9;

import java.util.Scanner;


public class OnlyNumberRef {

    private static int solution(String s) {
        //int answer = 0;
        String answer = "";
        for (char x : s.toCharArray()) {
/*
            if (x >= 48 && x <= 57) {
                answer = answer * 10 + (x - 48);
            }
*/
            if (Character.isDigit(x)) {
                answer += x;
            }
        }
        //return Integer.parseInt(answer);
        return Integer.parseInt(answer);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(solution(input));

    }

}
