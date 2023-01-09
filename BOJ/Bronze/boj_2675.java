import java.io.*;
import java.util.StringTokenizer;

public class boj_2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());

        for(int i =0; i <t;i++){

            String[] str = br.readLine().split(" ");

            int r = Integer.parseInt(str[0]);
            String s = str[1];

            for(int k =0; k<str[1].length();k++) {
                for (int y = 0; y < r; y++) {
                    sb.append(s.charAt(k));
                }
            }
            sb.append("\n");
        }

        bw.write(String.valueOf(sb));
        br.close();
        bw.close();

    }
}
