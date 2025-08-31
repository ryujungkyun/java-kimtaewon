package arlgorithm.session1;

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt(); // \n
        sc.nextLine();
        String[] result = new String[count];

        for (int i = 0; i < count; i++) {
            String str = sc.nextLine();
            StringBuilder sb = new StringBuilder(str);
            result[i] = sb.reverse().toString();
        }

        for (String x : result) {
            System.out.println(x);
        }
    }
}
