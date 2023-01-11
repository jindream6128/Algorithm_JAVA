import java.io.*;
import java.util.StringTokenizer;

public class boj_2875 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        //n여자, m남자, k 인턴십
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int cnt = 0;

        //여자 2명, 남자1명이 한팀, 인턴십에 갈사람을 빼고도 3명이 남아야 팀결성가능
        while (n >= 2 && m >= 1 && n + m >= k + 3) {
            cnt += 1;
            //2명 빠지고
            n = n - 2;
            //1명 빠지고
            m = m - 1;
        }
        bw.write(String.valueOf(cnt));
        bw.close();
        br.close();
    }
}
