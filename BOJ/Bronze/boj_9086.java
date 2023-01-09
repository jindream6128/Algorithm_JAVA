import java.io.*;

public class boj_9086 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i =0; i<t;i++){
            String s = br.readLine();
            sb.append(s.charAt(0));
            sb.append(s.charAt(s.length()-1)+ "\n");
        }

        bw.write(String.valueOf(sb));
        br.close();
        bw.close();
    }
}
