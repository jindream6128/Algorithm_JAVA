import java.io.*;
import java.util.StringTokenizer;

public class boj_9498  {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int num = Integer.parseInt(st.nextToken());

        if(90 <= num ) {bw.write("A");}
        else if (80<=num) {bw.write("B");}
        else if (70<=num) {bw.write("C");}
        else if (60<=num) {bw.write("D");}
        else {bw.write("F");}
        //출력
        //bw.write(String.valueOf());

        bw.close();
        br.close();
    }
}
