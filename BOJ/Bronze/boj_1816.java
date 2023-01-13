import java.io.*;

public class boj_1816 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] sosu = new int[1000001];

        for (int i = 1; i < 1000001; i++) {
            //소수 이면 1 소수가 아니면 2
            sosu[i] = 1;
        }

        //소수가 아닌거 골라야함
        for (int i = 1; i < 1000001; i++) {
            if (sosu[i] == 1) {//소수일때
                for (int j = i * i; j < 1000001; j++) {
                    sosu[j] = 0; //소수의 제곱은 소수가 아니다.
                }
            }
        }

        long s = Long.parseLong(br.readLine());
        for (int i = 0; i < n; i++) {
            String result = "YES"; //소수이다

            for (int j = 0; j < 1000001; j++) {
                if (sosu[j] == 1) { //소수일때
                    if (s % sosu[j] == 0) {
                        result = "NO";
                    }
                }

            }
            bw.write(result);

        }

        br.close();
        bw.flush();
    }
}
