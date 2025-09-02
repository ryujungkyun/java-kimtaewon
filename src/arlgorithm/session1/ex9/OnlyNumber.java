package arlgorithm.session1.ex9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OnlyNumber {

    private static List<Integer> solution(String str) {
        ArrayList<Integer> list = new ArrayList<>();

        for (char c : str.toCharArray()) {
            try {
                Integer i = Integer.parseInt(String.valueOf(c));
                list.add(i);

                if (list.get(0).equals(0)) {
                    list.remove(0);
                }

            } catch (NumberFormatException e) {
            }

        }

        return list;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        List<Integer> solution = solution(input);
        for (Integer i : solution) {
            System.out.print(i);
        }
    }
}
