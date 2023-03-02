package boj_13423;

import java.io.*;
import java.util.*;

public class boj_13423 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st ;
        int tc = Integer.parseInt(br.readLine());
        for(int i= 0; i<tc ; i++){
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];

            st = new StringTokenizer(br.readLine());
            for(int j =0 ;j<n; j++){
                arr[j] = Integer.parseInt(st.nextToken());
            }
            //정렬까지하기
            Arrays.sort(arr);

            int cnt = 0;
            for(int s = 0; s<n-2;s++){
                int e = s+2;
                for(int m = s+1; m<n-1; m++){
                    int num = arr[m] - arr[s];

                    while(e < n && arr[e] - arr[m] < num){
                        e++;
                    }
                    if(e==n) break;

                    if(arr[e] - arr[m] == num) cnt++;
                }
            }
            sb.append(cnt).append("\n");
        }

        System.out.println(sb);
        br.close();
    }
}
