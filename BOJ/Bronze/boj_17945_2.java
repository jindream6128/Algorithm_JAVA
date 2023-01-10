import java.io.*;
import java.util.StringTokenizer;

public class boj_17945_2 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb =new StringBuilder();
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        for (int i = -1000 ; i<1001; i++){
            if ((i*i) + (2*a*i) + b == 0){
                sb.append(i + " ");
            }
        }
        bw.write(String.valueOf(sb));
        br.close();
        bw.close();

    }
}
