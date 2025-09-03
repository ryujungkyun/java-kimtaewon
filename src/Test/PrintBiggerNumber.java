package Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PrintBiggerNumber {



    private static List<Integer> solution(int cnt, int[] inputs) {
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(inputs[0]);

        for (int i = 1; i < cnt; i++) {
            if (inputs[i] > inputs[i - 1]) {
                answer.add(inputs[i]);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        int[] inputs = new int[cnt];

        for (int i = 0; i < cnt; i++) {
            inputs[i] = sc.nextInt();  // 배열에 값 저장
        }

        for (Integer x : solution(cnt, inputs)) {
            System.out.print(x + " ");
        }
    }
}
