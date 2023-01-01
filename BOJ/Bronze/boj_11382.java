import java.io.*;
import java.util.StringTokenizer;

public class boj_11382 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        //범위 잘보고 자료형 선언하기
        //변수도 long 문자열을 변수로 바꾸는것도 Long.parseLong
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        long c = Long.parseLong(st.nextToken());


        //br bw모두 입출력이 string 이므로 형변환 꼭 해주기!
        bw.write(String.valueOf(a+b+c));

        // io close
        bw.close();
        br.close();
    }
}
