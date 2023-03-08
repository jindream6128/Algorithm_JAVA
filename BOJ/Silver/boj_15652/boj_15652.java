package boj_15652;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_15652 {
    //1부터n
    static int n ;
    //m자리
    static int len;

    static int[] arr;

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st ;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException{
        st = new StringTokenizer(br.readLine());

        n  = Integer.parseInt(st.nextToken());
        len = Integer.parseInt(st.nextToken());

        arr = new int[len];

        recur(1,0);
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
        for(int i = start; i<=n;i++){
            arr[cur] = i;
            //시작점 동일
            recur(i,cur+1);
        }

    }

}
