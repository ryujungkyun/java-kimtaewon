package arlgorithm.session1.ex12;

import java.util.Scanner;

//4
// #****###**#####**#####**##**
public class CodeStringTest {

    private static String solution(int count, String str) {
        String answer = "";

        for (int i = 0; i < count; i++) {
            String tmp = str.substring(0, 7).replace("#","1").replace("*","0");
            int result = Integer.parseInt(tmp, 2);
            answer += (char) result;
            str = str.substring(7);
        }
        return answer;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        sc.nextLine();
        String input = sc.nextLine();
        System.out.println(solution(count, input));
    }

}
