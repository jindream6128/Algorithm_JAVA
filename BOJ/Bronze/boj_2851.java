import java.io.*;

public class boj_2851 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        //점수

        //버섯 저장 10개
        int[] arr = new int[10];

        for (int i = 0; i < 10; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        int sum = 0;
        int ans =0;

        for (int i =0 ;i<arr.length;i++){
            sum += arr[i];
            if(Math.abs(sum-100) <= Math.abs(ans-100)){
                ans = sum;
            }
            else if(sum >100){break;}
        }
        bw.write(String.valueOf(ans));
        br.close();
        bw.flush();
    }
}
