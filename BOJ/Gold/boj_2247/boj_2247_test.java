package boj_2247;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_2247_test {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //일단 입력 n 자체는 2억까지
        int n = Integer.parseInt(br.readLine());
        long ans = 0;

        for (long i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                long j = n / i;
                if (i == j) {
                    ans += i;
                } else {
                    ans += i + j;
                }
            }
        }

        System.out.println(ans % 1_000_000);
        br.close();
    }
}
