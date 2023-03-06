package boj_2110;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class boj_2110 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        //총 집의 수
        int n = Integer.parseInt(st.nextToken());
        //공유기의 갯수
        int c = Integer.parseInt(st.nextToken());

        //집이 올라가있는 좌표
        int[] arr = new int[n];

        for(int i = 0 ;i < n ; i ++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);

        int start = 0;
        int end = arr[n-1];




        br.close();
    }
}
