import java.io.*;
import java.util.StringTokenizer;

public class boj_14697 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken()); //제일작은 수
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken()); //제일 큰수
        int n = Integer.parseInt(st.nextToken());
        int ans;
        int re, re1, re2;

        re = n % c;
        re1 = re % b;
        re2 = re1 % a;

        if (re == 0 || re1 ==0 || re2 ==0) {
            bw.write("1");
        } else {
            bw.write("0");
        }

        bw.flush();
        br.close();
    }
}
