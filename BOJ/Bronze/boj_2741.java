import java.io.*;

public class boj_2741 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for(int i = 1; i<=n; i++) {
            System.out.println(i);
        }
        br.close();
    }
}
