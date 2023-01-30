package boj_3964;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_3964_3 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            long n = Long.parseLong(st.nextToken());
            long k = Long.parseLong(st.nextToken());

            long result = Long.MAX_VALUE;

            for (long i = 2; i * i <= k; i++) {
                if (k % i == 0) {
                    int count = 0;
                    while (k % i == 0) {
                        count++;
                        k /= i;
                    }
                    result = Math.min(result, getCount(n, i, count));
                }
            }
            if (k > 1) {
                result = Math.min(result, getCount(n, k, 1));
            }
            sb.append(result).append("\n");
        }
        System.out.println(sb);
    }

    private static long getCount(long n, long k, int c) {
        long sum = 0;
        long power = k;
        while (true) {
            sum += n / power;
            if (power > n / k) {
                break;
            }
            power *= k;
        }
        return sum / c;
    }
}
