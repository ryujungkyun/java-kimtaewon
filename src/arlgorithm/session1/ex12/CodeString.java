package arlgorithm.session1.ex12;

import java.util.Scanner;

public class CodeString {

    private static String solution(int count, String str) {
        String answer = "";

        for (int i = 0; i < count; i++) {
            String tmp = str.substring(0, 7).replace("#", "1").replace("*", "0");
//            int num = Integer.parseInt(tmp, 2);
            int num = 0;
            for (int j = 0; j < tmp.length(); j++) {
                num = num * 2 + (tmp.charAt(j) - '0');
            }
            answer += (char) num;

            str = str.substring(7);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        sc.nextLine();
        if (count > 10) {
            System.out.println("10개 이상은 넘지 않아야 합니다");
            return;
        }
        String input = sc.nextLine();
        System.out.println(solution(count, input));
    }
}
