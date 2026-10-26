package Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrintBiggerNumber {

    private static List<Integer> solution(int count, int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(arr[0]);

        for (int i = 0; i < count - 1; i++) {
            if (arr[i] < arr[i+1]) {
                list.add(arr[i+ 1]);
            }
        }

        return list;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int[] arr = new int[count];


        for (int i = 0; i < count; i++) {
            arr[i] = sc.nextInt();
        }

        for (Integer x : solution(count, arr)) {
            System.out.print(x + " ");
        }
    }
}
