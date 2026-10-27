package arlgorithm.twoPointer;

import java.util.*;
import java.io.*;

public class 연속_부분배열 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        int[] a = new int[N];
        for(int i = 0; i < N; i++){
            a[i] = Integer.parseInt(st.nextToken());
        }

        int result = solution(a, N, M);
        System.out.print(result);
    }


    private static int solution(int[] a, int N, int M){
        int result = 0, sum = 0, lt = 0;

        for(int rt = 0; rt < N; rt++){
            sum += a[rt];
            if (sum == M) {
                result++;
            }
            while (sum > M) {
                sum -= a[lt++];
                if (sum == M) {
                    result++;
                }
            }
        }

        return result;
    }
}
