package boj_14232;

import javax.management.StringValueExp;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class boj_14232 {
    static boolean is_prime(long n) {
        for (long i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        long k = Long.parseLong(br.readLine());
        //보석 갯수
        //무게들이 들어갈 list
        ArrayList<Long> ansarr = new ArrayList<>();

        for (long i = 2L; i * i <= k; i++) {
            while (k % i == 0) {
                ansarr.add(i);
                k /= i;
            }
        }
        //소수
        if (k > 1) {
            ansarr.add(k);
        }
        Collections.sort(ansarr);
        bw.write(String.valueOf(ansarr.size()));
        bw.newLine();
        for (long ans : ansarr) {
            bw.write(String.valueOf(ans) + " ");
        }

        bw.close();
        br.close();
    }
}
