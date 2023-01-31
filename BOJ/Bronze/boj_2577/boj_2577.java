package boj_2577;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_2577 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        int ans = a*b*c;
        int[] arr = new int[10];
        while(ans>0){
            int tmp = ans%10;
            arr[tmp] += 1;
            ans = ans/10;
        }
        for(int i =0;i<10;i++){
            System.out.println(arr[i]);
        }
        br.close();
    }
}
