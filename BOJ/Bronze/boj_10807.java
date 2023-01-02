import java.io.*;
import java.util.StringTokenizer;

public class boj_10807 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n]; //n개 만큼의 배열크기 만들기

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i=0; i<arr.length; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int num = Integer.parseInt(br.readLine()); //찾는수

        int cnt = 0; //num과 일치하면 cnt 상승

        for(int i =0; i<arr.length;i++){
            if(arr[i] == num) cnt++;
        }

        bw.write(String.valueOf(cnt));
        br.close();
        bw.close();
    }
}
