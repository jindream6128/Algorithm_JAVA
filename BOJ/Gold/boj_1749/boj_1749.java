package boj_1749;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_1749 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] arr = new int[n + 1][m + 1];

        for (int i = 1; i < n + 1; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j < m + 1; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        //arr의 누적합 구하기
        int[][] arrsum = new int[n + 1][m + 1];
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < m + 1; j++) {
                arrsum[i][j] = arrsum[i - 1][j] + arrsum[i][j - 1] - arrsum[i - 1][j - 1] + arr[i][j];
            }
        }

        int ans = Integer.MIN_VALUE;
        //(x1,y1)과 (x2,y2)의 누적합 구하기 x1,y1은 1부터 M-1까지 돌고 x2 y2는 x1+1,y1+1부터 <까지 돌면 된다. => 이렇게 되면 범위의 합만 구하게 되네?
        // 해당하는 점들도 확인해주어야 한다.-> 3,3 한개일수도 있다
        for (int x1 = 0; x1 < n; x1++) {
            for (int y1 = 0; y1 < m; y1++) {
                for (int x2 = x1 + 1; x2 < n + 1; x2++) {
                    for (int y2 = y1 + 1; y2 < m + 1; y2++) {
                        int tmpsum = arrsum[x2][y2] - arrsum[x2][y1] - arrsum[x1][y2] + arrsum[x1][y1];
                        if (tmpsum > ans) {
                            ans = tmpsum;
                        }
                    }
                }
            }
        }

        System.out.println(ans);

        br.close();
    }
}
