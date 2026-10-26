package Test;

import java.util.Scanner;

public class StringCompression {

    private static String solution(String input) {
        String answer = "";
        input += " ";
        int cnt = 1;
        for (int i = 0; i < input.length() - 1; i++) {
            if (input.charAt(i) == input.charAt(i + 1)) {
                cnt++;
            } else {
                answer += input.charAt(i);
                if (cnt > 1) {
                    answer += cnt;
                    cnt = 1;
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
