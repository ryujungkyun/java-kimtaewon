package arlgorithm.session2.ex2;

import java.util.Scanner;

public class LookableStudentsCount {

    private static int solution(int count, int[] students) {
 /*       int max = Integer.MIN_VALUE;
        int cnt = 0;
        for (int i = 0; i < count ; i++) {
            if (students[i] > max) {
                max = students[i];
                cnt++;
            }
        }*/
        //첫 번째 학생은 항상 큰 수이기 때문에
        // 1부터 연산 할 수 있으면 해주자

        int cnt = 1, max = students[0];
        for (int i = 1; i < count; i++) {
            if (students[i] > max) {
                cnt++;
                max = students[i];
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int[] input = new int[count];

        for (int i = 0; i < count; i++) {
            input[i] = sc.nextInt();
        }

        System.out.println(solution(count, input));
    }
}
