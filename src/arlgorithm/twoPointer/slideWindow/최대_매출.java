package arlgorithm.twoPointer.slideWindow;

import java.util.*;
import java.io.*;


public class 최대_매출 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        int answer = solution(N, K, a);
        System.out.print(answer);
    }

    private static int solution(int N, int K, int[] a) {
        int result = 0, sum = 0;
        for (int i = 0; i < K; i++) {
            result += a[i];
        }

        sum = result;

        for(int i = K; i < N; i++) {
            sum += (a[i] - a[i - K]);
            result = Math.max(result, sum);
        }

        return result;
    }
}
