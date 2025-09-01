package arlgorithm.session1;

import java.util.ArrayList;
import java.util.Scanner;

public class ReverseStringRef {
    public static ArrayList<String> solution(int n, String[] str) {
        ArrayList<String> answer = new ArrayList<>();
/*        for (String x : str) {
            StringBuilder sb = new StringBuilder(x).reverse();
            answer.add(sb.toString());
        }*/

        for (String x : str) {
            char[] s = x.toCharArray();
            int lt = 0, rt = x.length() - 1;
            while (lt < rt) {
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }

//            firstExchangeChar(s);
            answer.add(String.valueOf(s));
        }
        return answer;
    }

    private static void firstExchangeChar(char[] s) {
        for (int i = 0; i < s.length / 2 ; i++) {
            char tmp;
            tmp = s[i];
            //s[s.length - 1 -i] -> 이 부분에서 s.length - 1만하면 그냥 그 인덱스
            //값만 바뀌게 됨으로 감소식을 추가로 달아 주어야 한다.
            s[i] = s[s.length - 1 -i];
            s[s.length - 1 -i] = tmp;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = sc.nextLine();
        }

        for (String x : solution(n,str)) {
            System.out.println(x);
        }
    }
}
