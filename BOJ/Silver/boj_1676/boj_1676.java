package boj_1676;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_1676 {
    static int cnt5(int n){
        int num =n;
        int cnt=0;
        while(num>0){
            cnt += num/5;
            //num/5는 결국 그다음 25생각
            num = num/5;
        }
        return cnt;
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        System.out.println(cnt5(n));

        br.close();
    }
}
