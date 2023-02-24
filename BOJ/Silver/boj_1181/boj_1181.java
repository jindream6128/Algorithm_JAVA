package boj_1181;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class boj_1181 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        String[] arr = new String[n];

        //일단 문자열들 전부 입력받기
        for (int i = 0; i < n; i++) {
            arr[i] = br.readLine();
        }

        //단어 정렬하기
        // compare의 return값이 양수이면 s1과 s2를 바꾼다.
        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                //만약 길이가 같을때
                if (s1.length() == s2.length()) {
                    //s1.compareTo(s2) -> s1 = s2 -> 0 / s1 > s2 =1(좌측이 더 큰 경우)
                    // s1 < s2 = -1 (우측이 더큰 경우)
                    return s1.compareTo(s2);
                }
                //길이가 다르면 그대로 정렬
                //s1 - s2 의 길이가 음수이면 s1 ,s2 순서를 바꾼다
                else {
                    return s1.length() - s2.length();
                }

            }
        });

        //일단 제일 처음꺼만 넣고, 중복되면 안넣을꺼니까 체크한다
        sb.append(arr[0]).append("\n");

        for(int j = 1; j<n;j++){
            //앞에꺼랑 다를때
            if(!arr[j-1].equals(arr[j])){
                sb.append(arr[j]).append("\n");
            }
        }

        System.out.println(sb);

        br.close();
    }


}
