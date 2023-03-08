package boj_15655;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class boj_15655 {
    static int n ;
    static int len;

    static int[] arr;
    static int[] example;

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        len = Integer.parseInt(st.nextToken());

        //정답의 길이
        arr = new int[len];
        example = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i =0; i<n; i++){
            example[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(example);

        recur(0,0);
        System.out.println(sb);
        br.close();
    }
    static void recur(int start, int cur){
        if(cur == len){
            for(int num : arr){
                sb.append(num).append(" ");
            }
            sb.append("\n");
            return;
        }

        for(int i = start; i<n; i++){
            arr[cur] = example[i];
            recur(i+1,cur+1);
        }
    }

}
