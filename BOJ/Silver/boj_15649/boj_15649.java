package boj_15649;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_15649 {
    //1부터 n
    static int n;

    //길이 m
    static int len;

    //출력 할 배열
    static int[] arr;

    //중복이 안되니까 사용하는 숫자츨 확인해야한다
    static boolean[] visited;

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());

        ///여기서 new로 새로운 n,m만드는거아니니까 조심하기
        n = Integer.parseInt(st.nextToken());
        len = Integer.parseInt(st.nextToken());

        arr = new int[len];
        visited = new boolean[n];

        recur(0);
        System.out.println(sb);
    }

    static void recur(int cur){
        if(cur==len){
            for(int num : arr){
                sb.append(num).append(" ");
            }
            sb.append("\n");
            return;
        }
        //배열 index랑 헷갈리기때문에 0으로 고정하고, 넣는 값에 1더해주기
        for(int i = 0; i<n; i++){
            //해당 숫자가 써졌으면 continue
            if(visited[i]){
                continue;
            }

            //그게 아니라면 i가 인덱스 때문에 0 이니까 값은 1더해주기
            arr[cur] =i+1;
            visited[i]=true;
            recur(cur+1);
            visited[i]=false;
        }
    }
}
