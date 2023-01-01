import java.io.*;

public class boj_2753 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());

        if(num%4==0){
            if(num%400==0) bw.write("1");
            else if (num%100==0) bw.write("0");
            else bw.write("1");
        }else{
            bw.write("0");
        }
        bw.close();
        br.close();
    }
}
