import java.io.*;
import java.util.StringTokenizer;

public class boj_17945 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        for(int x=-1000; x <= 1000; x++){
            if((x*x + 2*x*a+b)==0){
                sb.append(x).append(' ');
            }
        }
        System.out.println(sb);
        }
    }

