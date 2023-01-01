import java.io.*;
import java.util.StringTokenizer;

public class boj_14681 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //StringTokenizer st = new StringTokenizer(br.readLine()); <- 사용 안함, 
        //st.nextToken 이아니라 br.readLine 으로 확인하기
        int x = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());

        if(x>0){
            if(y>0) {
                bw.write("1");
            }else if(y<0){
                bw.write("4");
            }
        }else if (x<0){
            if(y>0){
                bw.write("2");
            }else if (y<0){
                bw.write("3");
            }
        }
        br.close();
        bw.close();
    }
}
