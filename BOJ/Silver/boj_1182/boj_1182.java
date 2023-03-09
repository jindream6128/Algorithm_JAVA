package boj_1182;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class boj_1182 {

    static int n;
    static int s;
    static int[] numList;
    static int[] arr;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();
    static int cnt = 0;
    static int len;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        s = Integer.parseInt(st.nextToken());

        numList = new int[n];


        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            numList[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(numList);

        for (len = 1; len < n + 1; len++) {
            arr = new int[len];
            recur(0, 0);
        }

        System.out.println(cnt);
        br.close();
    }

    static void recur(int start, int cur) {
        if (cur == len) {
            int total = 0;

            for (int num : arr) {
                total += numList[num];
            }

            if (total == s) {
                cnt++;
            }
            return;
        }


        for (int i = start; i < n; i++) {
            arr[cur] = i;
            recur(i + 1, cur + 1);
        }
    }

}
