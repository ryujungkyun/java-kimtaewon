package arlgorithm.session2.ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class PrintBiggerNumber {


    private static ArrayList<Integer> solution(int count, int[] inputArr) {
        ArrayList<Integer> intArr = new ArrayList<>();
        intArr.add(inputArr[0]);
        for (int i = 1; i < count  ; i++) {
            if (inputArr[i] > inputArr[i -1 ]) {
                intArr.add(inputArr[i]);
            }
        }
        return intArr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();
        int[] inputArr = new int[count];

        for (int i = 0; i < count; i++) {
            inputArr[i] = sc.nextInt();
        }

        for (Integer x : solution(count, inputArr)) {
            System.out.print(x + " ");
        }
    }
}
