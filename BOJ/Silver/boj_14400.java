import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class boj_14400 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        long x = 0;
        long y  =0;
        long[][] arr = new long[N][2];
        for(int i = 0; i <N;i++){
            String t[] = br.readLine().split(" ");
            arr[i][0] = x;
            arr[i][1] = y;
        }
    }
}
