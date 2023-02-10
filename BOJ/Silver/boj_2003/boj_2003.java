package boj_2003;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_2003 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n + 1];

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int L = 1, R = 1, cnt = 0;
        int sum = 0;

        while (L <= n) {
            if (sum >= m) {
                sum -= arr[L];
                L++;
            } else if (R > n) {
                break;
            } else {
                sum += arr[R];
                R++;
            }

            if (sum == m) {
                cnt++;
            }
        }
        System.out.println(cnt);
        br.close();
    }
}
