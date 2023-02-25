package boj_1436;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_1436 {
    public static void main(String[] args) throws IOException {
        // 정답이 저장될 배열
        int[] arr = new int[10_001];
        //cnt 가 0부터 출발해서 10_000이되면 종료 되도록 선언
        int cnt = 0;
        int i =1;
        while(true){
            if(cnt == 10_000){
                break;
            }


            String str = String.valueOf(i);
            //존재하면 true
            if(str.contains("666")){
                cnt++;
                arr[cnt]=i;
            }

            i++;
        }

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        System.out.println(arr[n]);
        br.close();
    }
}
