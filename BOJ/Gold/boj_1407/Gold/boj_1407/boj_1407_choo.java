package Gold.boj_1407;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_1407_choo {

    // 경고! 2의 제곱수만 넣으시오
    static long dp(long n) {
        if (n == 0b000) return 0;
        if (n == 0b001) return 0;
        if (n == 0b010) return 1;
        if (n == 0b100) return 4;
        //점화식 찾기
        return dp(n / 2) * 2 + (n / 2);
    }

    static long solveOnly2(long n) {
        return dp(n) + n;
    }

    static long solve(long n) {
        long part = 1;
        long answer = 0;
        while (true) {
            if (part > n) break;

            // 2의 제곱수를 가지고있는지 chk
            if ((n & part) != 0) {
                answer += solveOnly2(part);
            }
            part *= 2;
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());

        System.out.println(solve(b) - solve(a - 1));

        br.close();
    }
}
