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
            int strike_test =0;
            int ball_test =0;
            for(int j =1; j<n+1;j++){
                strike_test = 0;
                ball_test=0;

                //1의자리
                int a1 = arr[j]%10;
                // 10의 자리
                int a10 = (arr[j]%100)/10;
                //100의자리
                int a100 = arr[j]/100;

                //100의자리 동일
                if(a100 == i/100) {strike_test ++;}
                else if(a100 == (i%100)/10) {ball_test++;}
                else if(a100 == (i%10)) {ball_test++;}

                //10
                if(a10 == i/100) {ball_test ++;}
                else if(a10 == (i%100)/10) {strike_test++;}
                else if(a10 == (i%10)) {ball_test++;}

                //1
                if(a1 == i/100) {ball_test ++;}
                else if(a1 == (i%100)/10) {ball_test++;}
                else if(a1 == (i%10)) {strike_test++;}

                //스트라이크랑 볼이 동일해야한다
                if(strike[j] == strike_test && ball[j] == ball_test)
                {
                    result++;
                }
            }
        }
        System.out.println(result);
        br.close();
    }
}
