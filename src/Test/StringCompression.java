package Test;

import java.util.Scanner;

public class StringCompression {

    private static String solution(String input) {
        input = input + " ";
        String result = "";
        int count = 1;

        result += input.charAt(0);

        for (int i = 0; i < input.length() - 1; i++) {
            if (input.charAt(i) == input.charAt(i + 1)) {
                count++;
            } else {
                result += input.charAt(i);
                if (count > 1) {
                    result += count;
                    count = 1;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(solution(input));
    }
}
