package arlgorithm.session1.ex11;

import java.util.Scanner;

public class StringCompression {

    private static String solution(String s) {
        s = s + " ";
        String answer = "";
        int count = 1;
        for (int i = 0; i < s.length() -1 ; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                count++;
            } else {
                answer += s.charAt(i);
                if (count > 1) {
                    answer += count;
                    count = 1;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(solution(input));
    }
}
