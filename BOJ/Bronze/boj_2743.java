import java.io.*;

public class boj_2743 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(System.out));
        //입력받은 문자열 길이 출력
        String ans = br.readLine();
        bw.write(String.valueOf(ans.length()));
        bw.close();
        br.close();
    }
}
