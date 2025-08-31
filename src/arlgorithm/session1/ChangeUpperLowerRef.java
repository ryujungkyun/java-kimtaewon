package arlgorithm.session1;

import java.util.Scanner;

public class ChangeUpperLowerRef {

    public static String solution(String str) {
        StringBuilder answer = new StringBuilder();
        for (char x : str.toCharArray()) {
  /*          if (Character.isLowerCase(x)) {
                answer.append(Character.toUpperCase(x));
            } else {
                answer.append(Character.toLowerCase(x));
            }*/

            //소문자 65, 90 사이 대문자 65, 90사이
            if (x >= 65 && x <= 90) {
                answer.append((char)(x + 32));
            } else {
                answer.append((char)(x - 32));
            }
        }
        return answer.toString();
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(solution(str));
    }
}
