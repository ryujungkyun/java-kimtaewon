package arlgorithm.twoPointer;

import java.util.*;
import java.io.*;

public class 공통원소_구하기 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        int m = Integer.parseInt(br.readLine());
        int[] b = new int[m];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            b[i] = Integer.parseInt(st.nextToken());
        }

        List<Integer> solution = solution(n, m, a, b);

        StringBuilder sb = new StringBuilder();
        for(int i : solution){
            sb.append(i).append(" ");
        }

        //마지막 println <- ln제거 마무리 포멧 trim() 시도
        System.out.print(sb.toString().trim());
    }

    private static List<Integer> solution(int n, int m, int[] a, int[] b) {
        int p1 = 0, p2 = 0;
        List<Integer> result = new ArrayList<>(n + m);

        Arrays.sort(a);
        Arrays.sort(b);

        while(p1 < n && p2 < m){
            if(a[p1] == b[p2]){
                result.add(a[p1]);
                p1++;
                p2++;
            } else if(a[p1] < b[p2]){
                p1++;
            } else if(a[p1] > b[p2]){
                p2++;
            }
        }
        return result;

    }
}
