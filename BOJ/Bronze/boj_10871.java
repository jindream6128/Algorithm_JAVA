import java.io.*;
import java.util.StringTokenizer;

public class boj_10871 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());
    //새로운 st 객체 생성
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i<N; i++){
            int value = Integer.parseInt(st.nextToken());
            if (value<X){
                sb.append(value).append(' ');
            }
        }
        bw.write(String.valueOf(sb));

        bw.close();
        br.close();
    }
}
