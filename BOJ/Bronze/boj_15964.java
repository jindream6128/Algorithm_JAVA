import java.io.*;
import java.util.StringTokenizer;

public class boj_15964 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        long ans = (a+b)*(a-b);
        bw.write(String.valueOf(ans));
        bw.close();
        br.close();

    }
}
