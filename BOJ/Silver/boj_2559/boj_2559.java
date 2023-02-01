package boj_2559;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_2559 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] prefix = new int[n+1]; //제일앞 0으로 예외처리 없애주기
        prefix[0] = 0; //0을 안넣어도 초기값이 0 이지만, 보기 편하게 코드로 적어주기

        //누적합, n번 돌꺼다 앞에까지의 합에서 그다음 숫자 더하기
        st = new StringTokenizer(br.readLine());
        for(int i =1; i<n+1;i++){
            prefix[i] = prefix[i-1] + Integer.parseInt(st.nextToken());
        }
        //점 get을 통해서 max값 하나만 가지고 가자
        int max = Integer.MIN_VALUE;
        for(int i = k; i<n+1;i++){
            //3일 연속일때 prefix[5]-prfix[2]
            int tmp = prefix[i] - prefix[i-k];
            max = Math.max(tmp,max);
        }
        System.out.println(max);
        br.close();
    }
}
