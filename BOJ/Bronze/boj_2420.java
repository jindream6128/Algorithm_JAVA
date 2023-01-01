import java.io.*;
import java.util.StringTokenizer;

public class boj_2420 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        //결과값이 int를 넘어가므로 long 타입으로 풀기 n,m은 int범위 이내임
        long n = Long.parseLong(st.nextToken());
        long m = Long.parseLong(st.nextToken());
        long ans = n+(m*-1);
        //Math.abs로 절댓값 구하기
        bw.write(String.valueOf(Math.abs(ans)));
        bw.close();
        br.close();
    }
}
