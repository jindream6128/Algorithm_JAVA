import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class boj_1145 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[5];

        for(int i = 0 ;i<5;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        int ans=0;
        for (int i =1; i<1000001; i++){
            int cnt =0;
            for(int j = 0; j<arr.length;j++){
                if(i%arr[j] == 0){
                    cnt +=1;
                }
            }
            if (cnt>=3) {
                ans=i;
                break;
            }
        }

        bw.write(String.valueOf(ans));
        bw.flush();
        br.close();
    }
}
