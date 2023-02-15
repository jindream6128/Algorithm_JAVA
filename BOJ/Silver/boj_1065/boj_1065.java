package boj_1065;

import java.io.*;

public class boj_1065 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;
        if (n < 100) {
            cnt = n;
        }//n이 3자리 일때 일단 99를 더해준다 1~99까지
        else {
            cnt += 99;
            for (int i = 100; i <= n; i++) {
                //각자리의 차이를 비교
                //차례로 100 10 1 의자리
                int a = i / 100;
                int b = (i % 100) / 10;
                int c = i % 10;
                if ((a - b) == (b - c)) {
                    cnt++;
                }

            }
        }

        System.out.println(cnt);
        br.close();
    }
}

