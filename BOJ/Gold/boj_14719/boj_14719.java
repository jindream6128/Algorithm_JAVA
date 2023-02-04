package boj_14719;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_14719 {

    public static void main (String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int h = Integer.parseInt(st.nextToken()); // 높이
        int w = Integer.parseInt(st.nextToken()); // 가로 최대
        int[] arr = new int[w+1];
        int prefixsum = 0;
        int suffixsum = 0;

        st = new StringTokenizer(br.readLine());

        for(int i = 1; i<w+1;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int maxprefix=arr[0];
        for(int i = 1; i<w+1;i++){
            int beforeMaxprefix =maxprefix;
            maxprefix = Math.max(maxprefix, arr[i]);
            if(maxprefix >= beforeMaxprefix){
                for(int j = 2; j<i+1;j++){
                    prefixsum += (arr[j-1] - arr[j]);
                }
            }
        }

        int maxsuffix = arr[w];
        for(int i = w; i>0;i--){
            int beforeMaxsuffix = maxsuffix;
            maxsuffix = Math.max(maxsuffix, arr[i]);
            if(maxsuffix>=beforeMaxsuffix){
                for(int j = w-1;j<i-1;j--){
                    suffixsum += (arr[j+1]-arr[j]);
                }
            }
        }

        int ans = prefixsum+suffixsum;
        System.out.println(ans);


        br.close();
    }
}
