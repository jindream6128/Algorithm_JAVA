package boj_15654;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class boj_15654 {
    static int n;
    static int len;

    //m자리 저장할 배열
    static int[] arr;
    //자연수들 저장하기
    static int[] example;
    //방문했는지 체크하기  길이  n
    static boolean[] visited;


    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb =  new StringBuilder();
    static StringTokenizer st ;

    public static void main(String[] args) throws IOException{
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        len = Integer.parseInt(st.nextToken());

        arr = new int[len];
        visited = new boolean[n];
        example = new int[n];

        st = new StringTokenizer(br.readLine());
        for(int i =0; i<n; i++){
            example[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(example);

        recur(0);
        System.out.println(sb);
        br.close();
    }
    static void recur(int cur){
        if(cur == len){
            for(int num : arr) {
                sb.append(num).append(" ");
            }
            sb.append("\n");
            return;
        }

        for(int i = 0; i<n;i++){
            if(visited[i]){
                continue;
            }

            arr[cur] = example[i];
            visited[i] = true;
            recur(cur+1);
            visited[i] = false;
        }
    }
}
