import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class decimal {
    /* 소수의 자격
     * ***에라토스테네스의 체
     * boolean 배열 선언, 모든 수를 소수라고 가정하고 true로 초기화
     * i = 2부터 n까지, i의 배수는 소수가 아니므로 모두 제외한다.
     * i의 배수를 제외할 때, i의 제곱부터 제외한다.
     * (다른 수는 이미 다 지워져있음)
     */

    public class Main {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            String d = st.nextToken();
            String num = "";
            int cnt = 0;

            boolean[] arr = new boolean[b + 1]; // 인덱스가 b를 포함하는 b+1 크기의 boolean 배열 선언
            Arrays.fill(arr, true); // 모든 수를 소수라고 가정하고 true로 초기화
            arr[0] = false; // 0과 1은 수동으로 false로 만들어준다.
            arr[1] = false;

            for (long i = 2; i <= b; i++) {
                if (arr[(int)i]) { // true일 때만 조건문 진행
                    for (long j = i * i; j <= b; j += i) { // i의 배수를 지울 때 i의 제곱부터 지운다
                        arr[(int)j] = false;               // 다른 수는 이미 지워져있다
                    }
                }
            }

            for (int i = a; i <= b; i++) {
                if (arr[i]) {
                    num = i + "";
                    if (num.contains(d)) {
                        cnt++;
                    }
                }
            }

            System.out.println(cnt);

        }
    }
}
