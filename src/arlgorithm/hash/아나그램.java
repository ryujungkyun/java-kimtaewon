package arlgorithm.hash;

import java.io.*;
import java.util.*;

public class 아나그램 {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine();
        String str2 = br.readLine();

        String result = solution(str1, str2);
        System.out.print(result);
    }

    private static String solution(String str1, String str2) {
        String result = "YES";
        Map<Character, Integer> map = new HashMap<>();
        for (char key : str1.toCharArray()) {
            map.put(key, map.getOrDefault(key, 0) + 1);
        }


        for (char key : str2.toCharArray()) {
            if (!map.containsKey(key) || map.get(key) == 0) {
                result = "NO";
                return result;
            }
            map.put(key, map.get(key) - 1);

        }


        return result;
    }
}
