import java.io.*;
import java.util.StringTokenizer;

public class boj_2475 {
    public static void main(String[] args) throws IOException{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st =new StringTokenizer(br.readLine());
        int sum =0;
        for(int i=0; i<5;i++){
            int a = Integer.parseInt(st.nextToken());
            sum += a*a;
        }
        int ans = sum%10;
        bw.write(String.valueOf(ans));
        br.close();
        bw.close();

    }
}
