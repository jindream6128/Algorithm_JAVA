package boj_1018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_1018 {
    static Boolean[][] arr;
    static int ans = 65;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        //m은 세로
        int m = Integer.parseInt(st.nextToken());
        //n은 가로
        int n = Integer.parseInt(st.nextToken());
        arr = new Boolean[m][n];

        for (int i = 0; i < m; i++) {
            String s = br.readLine();
            for (int j = 0; j < n; j++) {
                if (s.charAt(j) == 'W') {
                    arr[i][j] = true;
                }else{
                    arr[i][j] = false;
                }
            }
        }

        System.out.println(check(m, n));

        br.close();
    }

    //최솟값을 찾아주는 함수
    static int check(int m, int n) {

        for (int i = 0; i < m - 7; i++) {
            for (int j = 0; j < n - 7; j++) {
                Boolean tmp = arr[i][j];
                int cnt = 0;

                for (int next_x = i; next_x < i + 8; next_x++) {
                    for (int next_y = j; next_y < j + 8; next_y++) {
                        if (arr[next_x][next_y] != tmp) {
                            cnt++;
                        }
                        tmp = (!tmp);
                    }
                    //다음줄은 서로 반대로 시작
                    tmp = (!tmp);
                }
                //만약에 64개중에서 제일처음꺼만 빼고 전부다 바꾸어야 한다면 63개를 바꾸어야한다.
                //하지만 반대로 63개를 두고 1개만 바꾸어도 조건에는 부합한다. 따라서. 64-cnt도 한값에서 최소값을 찾아야 한다.
                cnt = Math.min(cnt,64-cnt);
                ans = Math.min(ans, cnt);
            }
        }

        return ans;
    }

}
