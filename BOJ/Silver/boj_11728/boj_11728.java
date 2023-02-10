package boj_11728;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class boj_11728 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] sumArr = new int[n+m];

        st = new StringTokenizer(br.readLine());
        for(int i =0; i<n;i++){
            sumArr[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for(int i = n; i<n+m;i++){
            sumArr[i] = Integer.parseInt(st.nextToken());
        }

        //오름차순정렬
        Arrays.sort(sumArr);

        for(int ans : sumArr){
            sb.append(ans).append(" ");
        }

        System.out.println(sb);
        br.close();
    }
}
