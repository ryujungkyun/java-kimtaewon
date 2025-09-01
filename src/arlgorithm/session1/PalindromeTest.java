package arlgorithm.session1;

import java.util.Scanner;

public class PalindromeTest {

    public static String solution(String str) {
        String lowerCase = str.toLowerCase();
        StringBuilder sb = new StringBuilder(lowerCase);
        String originString = new String(sb);
        String reverse = new String(sb.reverse());

        //StringBuilder는 equals 비교가 안되어 있다
        if (originString.equals(reverse)) {
            return "YES";
        } else {
            return "NO";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(solution(str));
    }
}
