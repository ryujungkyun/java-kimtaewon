package arlgorithm.twoPointer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 연속된_자연수의_합 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int m = (n / 2) + 1;

        int[] a = new int[m];
        for (int i = 0; i < m; i++) {
            a[i] = i + 1;
        }


        int result = solution(n, m, a);
        System.out.print(result);
    }

    private static int solution(int n, int m, int[] a) {
        int result = 0, sum = 0, lt = 0;

        for(int rt = 0; rt < m; rt++) {
            sum += a[rt];
            if (sum == n) {
                result++;
            }

            while (sum > n) {
                sum -= a[lt++];

                if (sum == n) {
                    result++;
                }
            }
        }
        return result;
    }
}
