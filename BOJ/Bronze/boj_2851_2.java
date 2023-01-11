import java.io.*;

public class boj_2851_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        //점수

        //버섯 저장 10개
        int[] arr = new int[10];

        for (int i = 0; i < 10; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int before, after;
        int ans;
        ans =arr[0];

        for(int a = 1; a <arr.length;a++){
            before = ans;
            after = ans + arr[a];
            if ((Math.abs(100-after)) <= (Math.abs(100-before))){
                ans += arr[a];
            } else{
                break;
            }
        }
        bw.write(String.valueOf(ans));
        bw.close();
        br.close();


    }
}
