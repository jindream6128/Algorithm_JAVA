import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Factorization {
    //소인수분해
    static void factorization(long n) {
        long num = n;
        for (long i = 2; i * i <= n; i++) {
            while (num % i == 0) {
                System.out.println(i);
                num = num / i;
            }
        }
        if (num != 1) {
            System.out.println(num);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        factorization(n);

        br.close();
    }
}
