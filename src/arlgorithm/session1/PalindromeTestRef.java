package arlgorithm.session1;

import java.util.Scanner;

public class PalindromeTestRef {

    public static String solution(String str) {
        String answer = "YES";
        str = str.toUpperCase();
        //String tmp = new StringBuilder(str).reverse().toString();
        //if(str.equalsIgnoreCase(tmp)) answer="Yes";
        int len = str.length();
        for (int i = 0; i < len / 2; i++) {
            if (str.charAt(i) != str.charAt(len - i - 1)) {
                answer = "NO";
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        System.out.println(solution(input));

    }
}
