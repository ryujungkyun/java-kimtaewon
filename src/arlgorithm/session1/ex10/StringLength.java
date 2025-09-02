package arlgorithm.session1.ex10;

import java.awt.*;
import java.util.Scanner;

public class StringLength {

    private static int[] solution(String str, char c) {
        int p = 1000;
        int[] result = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                p = 0;
                result[i] = p;
                p++;
            } else {
                result[i] = p;
                p++;
            }
        }

        p = 1000;
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) == c) {
                p = 0;
                p++;
            } else {
                result[i] = Math.min(result[i],p);
                p++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        char c = sc.next().charAt(0);
        int[] solution = solution(input, c);
        for (int i : solution) {
            System.out.print(i + " ");
        }
    }
}
