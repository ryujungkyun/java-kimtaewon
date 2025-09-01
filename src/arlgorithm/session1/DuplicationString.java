package arlgorithm.session1;

import java.util.ArrayList;
import java.util.Scanner;

//다시 공부 

public class DuplicationString {

    private static String solution(String input) {
        String result = "";
        for (int i = 0; i < input.length(); i++) {
/*            System.out.println(input.charAt(i) + " " + i +
                    " " + input.indexOf(input.charAt(i)));*/
            if (input.indexOf(input.charAt(i)) == i) {
                result += input.charAt(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        System.out.println(solution(input));
    }

}
