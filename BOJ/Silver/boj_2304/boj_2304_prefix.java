package boj_2304;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_2304_prefix {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        int[] height = new int[1002]; //제일 앞과, 제일 뒤에 0 추가
        //해당 위치에 높이 넣기
        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            height[Integer.parseInt(st.nextToken())] = Integer.parseInt(st.nextToken());
        }

        //앞에서 부터
        int[] right = new int[1002];
        for(int i =1 ; i<1001;i++){
            right[i] = Math.max(right[i-1],height[i]);
        }

        //뒤에서 부터
        int[] left = new int[1002];
        for(int i = 1000; i>0; i--){
            left[i] = Math.max(left[i+1],height[i]);
        }
        //최대값만 계속 더하면 된다 height[8] =10은 동일하니까 작은거 계속 더해주기
        int ans =0;
        for(int i =1;i<=1000;i++){
            ans += Math.min(right[i],left[i]);
        }
        System.out.println(ans);
    }
}
