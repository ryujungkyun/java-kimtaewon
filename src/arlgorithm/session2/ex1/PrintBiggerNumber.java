package arlgorithm.session2.ex1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class PrintBiggerNumber {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 첫 줄: 자연수 N
        int n = Integer.parseInt(br.readLine());

        // 두 번째 줄: N개의 정수
        String[] parts = br.readLine().split(" ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(parts[i]);
        }

        // 첫 번째 수는 무조건 출력
        System.out.print(arr[0] + " ");

        // 바로 앞 수보다 큰 경우 출력
        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[i - 1]) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
