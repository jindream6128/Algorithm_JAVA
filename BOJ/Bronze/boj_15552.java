import java.io.*;
import java.util.StringTokenizer;

public class boj_15552 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for(int i =0; i<t;i++){
            st = new StringTokenizer(br.readLine()," ") ;
            bw.write(String.valueOf(Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken())));
            bw.newLine();
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
