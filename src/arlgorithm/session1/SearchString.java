package arlgorithm.session1;

import java.util.Scanner;

public class SearchString {
    private static void solution(String searchString, String findChar) {
        int count = 0;

        char[] charArray = searchString.toLowerCase().toCharArray();
        //찾는 문자값도 toLowerCase()를 해줘야한다
        String lowerChar = findChar.toLowerCase();

        for (char c : charArray) {
            if (String.valueOf(c).equals(lowerChar)) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String searchString = scanner.nextLine();
        String findChar = scanner.nextLine();

        solution(searchString, findChar);
    }
}
