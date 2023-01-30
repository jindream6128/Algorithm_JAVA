package boj_3964;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class boj_3964 {

    //소수 인지 확인하기
    static boolean isPrime(long n) {
        if (n == 1) return false;
        for (long i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int tc = Integer.parseInt(br.readLine());
        for (int i = 0; i < tc; i++) {
            st = new StringTokenizer(br.readLine());
            long n = Long.parseLong(st.nextToken());
            long k = Long.parseLong(st.nextToken());
            //소수일땐 그냥 몇개 들어있는지 구하기
            if (isPrime(k)) {
                int cnt = 0;
                long tmp = k;
                while (tmp <= n) {
                    cnt += (n / tmp);
                    tmp = tmp * k;
                }
                System.out.println(cnt);
            } else {
                //k가 소수가 아닐때 소인수분해 해보기
                long ans=n;
                long tmp;
                long num =k;
                long num2 =n;
                long result = 0;
                for(int p =2; p*p<=k;p++){
                    int cnt1 = 0;
                    while(num%p ==0){
                        cnt1++;
                        num /= p;
                    }
                    //p는 2부터 즉 몇번 들어있는지 cnt된거 3으로 넘어가면 cnt는 초기화
                    //똑같이 n!에 p가 몇번들어있는지 확인하기
                    int cnt2=0;
                    while(num2%p ==0){
                        cnt2++;
                        num2/=p;
                    }
                        tmp = cnt2/cnt1;
                        result = Math.min(tmp,ans);
                }
                System.out.println(result);
            }
        }
        br.close();
    }

}