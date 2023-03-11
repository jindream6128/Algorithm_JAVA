package boj_10819;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_10819 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static int ans = Integer.MIN_VALUE;

    //배열의 크기
    static int n;
    static int[] arr; //입력될 arr
    //정답이 저장될 arr
    static int[] result;
    //숫자를 사용했는지 check
    static boolean[] visited;

    public static void main(String[] args) throws IOException{
        n = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        arr = new int[n];
        result = new int[n];
        visited = new boolean[n];
        for(int i = 0 ; i<n;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        recur(0);
        System.out.println(ans);
        br.close();

    }

    static void recur(int cur){
        if(cur == n){
            int tmp =0;
            for(int i = 0; i<n-1;i++){
                tmp += Math.abs(result[i]-result[i+1]);
            }
            ans = Math.max(tmp,ans);

            return;
        }

        for(int i = 0; i<n;i++){
            if(visited[i] == true){
                continue;
            }

            result[cur] = arr[i];
            visited[i] = true;
            recur(cur+1);
            visited[i] = false;
        }

    }
}
