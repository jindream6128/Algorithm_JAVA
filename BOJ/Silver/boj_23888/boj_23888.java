package boj_23888;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_23888 {
    static int a;
    static int d;

    //등차수열 일반항 클래스 n넣으면 값 리턴
    static long arithmeticsequence(long n) {
        long ans = a + (n - 1) * d;
        return ans;
    }

    //등차급수 메서드
    static long sumsequence(long s, long r) {
        //시작항 + 끝항 *(갯수/2)
        long ans = (arithmeticsequence(s) + arithmeticsequence(r)) * (r - s + 1) / 2;
        return ans;
    }

    //gcd
    static long gcd(long ans1, long ans2) {
        return ans2 == 0 ? ans1 : gcd(ans2, ans1 % ans2);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        //초항a 공차 d
        a = Integer.parseInt(st.nextToken());
        d = Integer.parseInt(st.nextToken());
        //초항과 공차로 등차수열의 일반항

        st = new StringTokenizer(br.readLine());
        //tc쿼리의 갯수
        int q = Integer.parseInt(st.nextToken());
        //쿼리만큼 반복하기
        for (int i = 0; i < q; i++) {
            st = new StringTokenizer(br.readLine());
            //tc, l ,r 받아오기 1번 2번 쿼리 케이스
            int tc = Integer.parseInt(st.nextToken());
            if (tc == 1) {
                //등차급수 구하기
                int l = Integer.parseInt(st.nextToken());
                int r = Integer.parseInt(st.nextToken());
                System.out.println(sumsequence(l, r));
            }
            if (tc == 2) {
                //gcd 값들중 gcd 구하기
                int l = Integer.parseInt(st.nextToken());
                int r = Integer.parseInt(st.nextToken());
                long gcdtmp = gcd(arithmeticsequence(l), d);
                if (l == r) {
                    gcdtmp = arithmeticsequence(l);
                }
                System.out.println(gcdtmp);
            }
        }
        br.close();

    }
}
