package Test;

import java.util.Scanner;

public class extractNumber {


    private static int solution(String input) {
        int answer = 0;
        for (char x : input.toCharArray()) {
            if (x >= 48 && x <= 57) {
                answer = answer * 10 + (x - 48);
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
