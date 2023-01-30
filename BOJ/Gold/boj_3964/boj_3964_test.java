package boj_3964;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_3964_test {

    static boolean isNotPrime(int n) {
        // 조건에서 소인수분해가 필요한건 10^12 이다. 따라서 루트를씌우면 10^6이므로 1_000_000 만큼의 선언
        //에라토스테네스의 채 -> 초기값 false
        boolean[] isNotPrime = new boolean[1_000_001];
        for (int i = 2; i * i <= 1_000_000; i++) {
            if (isNotPrime[i] = false) { //가 소수일때 소수의 제곱은 지울려고
                for (long notPrime = (long) i * i; notPrime <= 1_000_000; notPrime += i) {
                    //notPrime은 i의 제곱수부터 덜고 해당 값들은 전부 소수가 아닌 notPrime의 True가 반환된다.
                    isNotPrime[(int) notPrime] = true;
                }
            }
        }
        return isNotPrime[n];
    }

    static long count(long n, long i, int cnt) {
        long sum = 0;
        while (n > 0) {
            sum += n;
            sum /= i;
        }
        return sum / cnt;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int tcc = 0; tcc < tc; tcc++) {
            st = new StringTokenizer(br.readLine());
            long n = Long.parseLong(st.nextToken());
            long k = Long.parseLong(st.nextToken());
            long numk = k;
            long numn = n;
            long tmp = 1_000_000_000_000L;
            long ans = 0;
            for (int i = 2; i <= 1_000_001; i++) {
                if (isNotPrime(i) == false) {//false -> 소수
                    if (i * i > k) {
                        break;
                    }
                    if (numk % i == 0) {
                        int cnt = 0;
                        while (numk % i == 0) {
                            cnt++;
                            numk = numk / i;
                        }
                        ans = Math.min(count(n, i, cnt), tmp);
                    }
                }
                if (numk > 1) {
                    ans = Math.min(count(n, numk, i), tmp);
                }
            }
            System.out.println(ans);

        }
        br.close();

    }
}


