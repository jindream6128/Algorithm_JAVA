package boj_1654;

import java.io.*;
import java.util.*;

public class boj_1654 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int k = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int[] arr = new int[k];
        for(int i = 0 ; i<k ; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        //오름차순 정렬
        Arrays.sort(arr);
        int maxNum = arr[k-1];
        while(true){
            int cnt =0;
            maxNum /= 2;
            for(int j = 0; j<k;j++){
                cnt += arr[j]/maxNum;
            }
            if(n<=cnt){
                break;
            }
        }
        System.out.println(maxNum);
        br.close();
    }
}
