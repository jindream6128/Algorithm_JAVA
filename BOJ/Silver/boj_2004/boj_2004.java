package boj_2004;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_2004 {

    static int cnt5(long n){
        long num = n;
        long cnt =0;
        while (num > 0) {
            cnt += num/5;
            num = num/5;
        }
        return (int)cnt;
    }
    static int cnt2(long n){
        long num = n;
        long cnt =0;
        while (num > 0) {
            cnt += num/2;
            num = num/2;
        }
        return (int)cnt;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long n = Long.parseLong(st.nextToken());
        long k = Long.parseLong(st.nextToken());

        // nCm = n! / ((n-k)! * k!)
        // cnt5 = n!의 5의 지수승 - (n-k)!의 5의 지수승 - k!의 5의 지수승
        int ans5 = cnt5(n) - cnt5(n-k) - cnt5(k);
        int ans2 = cnt2(n) - cnt2(n-k) - cnt2(k);
        int ans = Math.min(ans2,ans5);

        System.out.println(ans);
        br.close();
    }
}
