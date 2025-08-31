package arlgorithm.session1;

import java.util.Scanner;

public class SearchStringRef {


    private static int solution(String str, char t) {
        int answer = 0;
        str = str.toUpperCase();
        t = Character.toUpperCase(t);
        //System.out.println(str+ " " + t);
/*        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == t) {
                answer++;
            }
        }*/

        for (char x : str.toCharArray()) {
            if (x == t) {
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char c = sc.nextLine().charAt(0);
        System.out.println(solution(str,c));
    }
}
