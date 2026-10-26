package arlgorithm.twoPointer;

import java.io.*;
import java.util.*;

public class 두_배열_합치기 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arrN = new int[n];
        for (int i = 0; i < n; i++) {
            arrN[i] = Integer.parseInt(st.nextToken());
        }

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        int [] arrM = new int[m];
        for (int i = 0; i < m; i++) {
            arrM[i] = Integer.parseInt(st.nextToken());
        }

        List<Integer> solution = solution(arrN, arrM, n, m);

        StringBuilder sb = new StringBuilder();
        for (Integer i : solution) {
            sb.append(i).append(" ");
        }

        System.out.println(sb);
    }

    private static List<Integer> solution(int[] arrN, int[] arrM, int n , int m) {
        int p1 = 0;
        int p2 = 0;

        // List에 초기 활당으로 정확한 용량 화보
        List<Integer> result = new ArrayList<>(n + m);
        while (p1 < n && p2 < m) {
            if (arrN[p1] < arrM[p2]) {
                result.add(arrN[p1++]);
            } else {
                result.add(arrM[p2++]);
            }
        }


        while (p1 < n) {
            result.add(arrN[p1++]);
        }

        while (p2 < m) {
            result.add(arrM[p2++]);
        }

        return result;
    }
}
