import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_10859 {
    //소수인지 체크하는 logic
    static boolean decimal(long n) {
        if (n == 1) {
            return false;
        }
        //1이랑 n 한개의 짝 이외에 또다른 소수의 약수 짝이 존재하는지 체크하기.
        for (long i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    //숫자 뒤집는 logic
    static long reversenum(long n) {
        long renum = 0;
        long prnum = n;
        while (prnum > 0) {
            if (prnum % 10 == 6) {
                renum = renum * 10 + 9;
            } else if (prnum % 10 == 9) {
                renum = renum * 10 + 6;
            } else {
                renum = ((renum * 10) + (prnum % 10));
            }
            prnum = prnum / 10;
        }
        return renum;
    }

    //숫자를 뒤집기 전에 3 4 7 이 들어있으면 뒤집었을때 숫자가 아니므로 먼저 확인해준다.
    static boolean changecheck(long n) {
        long tmp = n;
        while (tmp > 0) {
            long k = tmp % 10;
            if (k == 3 || k == 4 || k == 7) {
                return false;
            }
            tmp = tmp / 10;
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long num = Long.parseLong(br.readLine());
        String ans = "no";
        //num이 소수때
        if (decimal(num)) {
            //숫자안에 3 4 7이 없어야한다
            if (changecheck(num)) {
                //뒤집은 숫자 소수확인
                if (decimal(reversenum(num))) {
                    ans = "yes";
                }
            }
        }
        System.out.println(ans);
        br.close();
    }
}
