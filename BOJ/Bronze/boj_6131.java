import java.io.*;

public class boj_6131 {
    public static void main(String[] args) throws IOException{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(System.out));

        int cnt =0;
        int n = Integer.parseInt(br.readLine());

        for(int b = 1; b<=500;b++){
            for(int a = 1; a<=500; a++){
                if((a*a == b*b + n) && (b<=a)){
                        cnt +=1;
                }
            }
        }
        bw.write(String.valueOf(cnt));
        br.close();
        bw.close();
    }
}
