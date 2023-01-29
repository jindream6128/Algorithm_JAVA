package boj_2247;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_2247_ans {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //일단 입력 n 자체는 2억까지
        int n = Integer.parseInt(br.readLine());
        long ans =0;
        for(long i = 2; i*i<=n;i++){
            long j = n /i;
            ans = ans + (i+j) *(j-i+1) / 2+i*(j-i);
        }
        ans = ans%1_000_000;

        System.out.println(ans);
        br.close();
    }
}
