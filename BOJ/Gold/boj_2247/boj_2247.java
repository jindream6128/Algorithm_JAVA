package boj_2247;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_2247 {
    static long CSOD(long n){
        long ans =0;
        //어짜피 1 2 3 은 모두 0
        for(long i =1; i<=n; i++){
            ans += SOD(i);
        }
        return ans%1_000_000;
    }

    static long SOD(long n) {
        long num = n;
        long ans = 0;
        //n이 1or2 이면 0을 리턴
        if ((n==1)||(n==2)) {
            return 0;
        }
        //n이 소수가 아닐때 약수 구하기
        for (long i = 2; i * i <= n; i++) {
            //약수일때 -> 근데 제곱수일때는 한번만 더해져야함.
            if (num % i == 0) {
                long tmp = num / i;
                if(tmp!=i) {
                    ans += i;
                    ans += tmp;
                }
                else if(tmp==i){
                    ans+=i;
                }
            }
        }
        return ans;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //일단 입력 n 자체는 2억까지
        int n = Integer.parseInt(br.readLine());
        System.out.println(CSOD(n));
        System.out.println(SOD(n));
        br.close();
    }
}
