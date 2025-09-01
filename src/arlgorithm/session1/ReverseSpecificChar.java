package arlgorithm.session1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 다시 풀어 보자
 */
public class ReverseSpecificChar {

    private static String solution(char[] charArr) {
        int lt = 0, rt = charArr.length - 1;

        while (lt < rt) {
            if (!Character.isAlphabetic(charArr[lt])) {
                lt++;
            } else if (!Character.isAlphabetic(charArr[rt])) {
                rt--;
            } else {
                char tmp = charArr[lt];
                charArr[lt] = charArr[rt];
                charArr[rt] = tmp;
                lt++;
                rt--;
            }

        }
        return String.valueOf(charArr);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String result = sc.nextLine();
        System.out.println(solution(result.toCharArray()));

    }
}
