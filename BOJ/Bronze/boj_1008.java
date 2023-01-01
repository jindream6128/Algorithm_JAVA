import java.io.*;
import java.util.StringTokenizer;

public class boj_1008 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        double a = Integer.parseInt(st.nextToken());
        double b = Integer.parseInt(st.nextToken());

        //br bw모두 입출력이 string 이므로 형변환 꼭 해주기!
        bw.write(String.valueOf(a/b));

        // io close
        bw.close();
        br.close();
    }
}
