import java.io.*;

public class boj_11720 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int sum =0;
        String[] s = br.readLine().split("");

        for(int i =0; i <s.length;i++){
            sum += Integer.parseInt(s[i]);
        }
        bw.write(String.valueOf(sum));
        br.close();
        bw.close();
    }
}
