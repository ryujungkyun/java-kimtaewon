package arlgorithm.hash;

import java.io.*;
import java.util.*;

public class 학급_회장 {

    public static void main(String[] args) throws IOException {


        //StringTokenizer 같은 경우에는 ACBFSDF 이렇게 붙어있으면 쓰면 안된다
        //br.readLine()을 st에 넣게 된다면 루프떄 오류가 생긴다  A B C D 이렇게 뛰어야 된다

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String m = br.readLine();

        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (char key: m.toCharArray()) {

            //해당 부분이 핵심 키워드
            hashMap.put(key, hashMap.getOrDefault(key,0) + 1);
        }

/*
        System.out.println(hashMap.containsKey('C'));
        System.out.println(hashMap.size());
        System.out.println(hashMap.remove('C'));
        System.out.println(hashMap.size());
*/

        int result = Integer.MIN_VALUE;
        // char에서 '' 이렇게 붙으면 컴파일 에러 발생 ' ' 여야 초기화 가능
        // char는 문자 1개 이상이여하는데 ''는 길이 0 ' '는 길이 1
        char resultChar = ' ';

        //Set도 순회가 가능하다
        for (Character c : hashMap.keySet()) {
            if (hashMap.get(c) > result) {
                result = hashMap.get(c);
                resultChar = c;
            }
        }

        System.out.println(resultChar);
    }
}


