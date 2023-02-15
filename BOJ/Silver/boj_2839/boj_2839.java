package boj_2839;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_2839 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;

        while(n>=3){
            //5의 배수가 아닐때
            if((n%5)!=0){
                n-=3;
                cnt++;
            }else{
                n-=5;
                cnt++;
            }
        }
        if(n!=0){
            cnt = -1;
        }
        System.out.println(cnt);
        br.close();
    }
}
