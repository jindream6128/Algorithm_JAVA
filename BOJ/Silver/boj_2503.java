import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class boj_2503 {
    public static void main(String[] args) throws IOException{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        //n 1<=n<=100
        int n = Integer.parseInt(br.readLine());
        //arr에 입력
        int[] arr = new int[n+1];
        int[] strike = new int [n+1];
        int[] ball = new int [n+1];
        for(int i =1;i<n+1;i++){
            st = new StringTokenizer(br.readLine());
            arr[i] = Integer.parseInt(st.nextToken());
            strike[i] = Integer.parseInt(st.nextToken());
            ball[i] = Integer.parseInt(st.nextToken());
        }
        int result =0;

        //전부 탐색 서로 다른 숫자
        for(int i = 123 ; i< 988;i++){
            for(int j = 0; j <n; j++){
                int s = 0; int b =0;
                //1의자리
                char a1 = (char)(arr[j]%10);
                // 10의 자리
                char a10 = (char)((arr[j]%100)/10);
                //100의자리
                char a100 = (char)(arr[j]/100);
                //if()
            }
        }
    }
}
