package boj_1806;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj__1806_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        //수열의 크기 n
        int n = Integer.parseInt(st.nextToken());
        //부분합 s
        int s = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int l = 0, r = 0, sum = 0, cnt = Integer.MAX_VALUE;
        while (true) {
            if(sum>=s) {
                cnt = Math.min(r - l, cnt);
                sum -= arr[l];
                l++;
            }
            else if(r == n){
                break;
            }
            else{
                sum += arr[r];
                r++;
            }
        }


        if (cnt == Integer.MAX_VALUE) {
            System.out.println(0);
        } else {
            System.out.println(cnt);
        }

        br.close();
    }
}
