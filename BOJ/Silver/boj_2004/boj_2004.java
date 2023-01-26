package boj_2004;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_2004 {
    //팩토리얼
    static long factorial(long n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    static int count2(long n){
        int count = 0;
        long num = n;

        while(num >= 2){
            count += num/2;
            num=num/2;
        }
        return count;
    }

    static int count5(long n){
        int count = 0;
        long num = n;

        while(num >= 5){
            count += num/5;
            num=num/5;
        }
        return count;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long n = Long.parseLong(st.nextToken());
        long m = Long.parseLong(st.nextToken());

        // nCm = n! / ((n-m)! * m!)
        // cnt2 = n!의 2의 지수승 - (n-m)!의 2의 지수승 - m!의 2의 지수승
        // cnt5 = n!의 5의 지수승 - (n-m)!의 5의 지수승 - m!의 5의 지수승
        int cnt2 = count2(factorial(n)) - count2(factorial(n-m)) - count2(factorial(m));
        int cnt5 = count5(factorial(n)) - count5(factorial(n-m)) - count5(factorial(m));
        int ans = Math.min(cnt2,cnt5);

        System.out.println(ans);
        br.close();
    }
}
