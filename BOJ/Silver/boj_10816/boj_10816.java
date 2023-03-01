package boj_10816;

import java.io.*;
import java.util.*;

public class boj_10816 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st ;
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i<n;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        for(int i = 0 ; i<m;i++){
            int target = Integer.parseInt(st.nextToken());

            int s = 0;
            int e = n-1;
            int r = -1;

            while(s<=e){
                int mid = (s+e)/2;

                if(arr[mid] > target){
                    e= mid -1;
                }else if(arr[mid] < target){
                    s = mid +1;
                }else{
                    r = mid;
                    s = mid +1;
                }
            }

            s = 0;
            e = n-1;
            int l = 0;
            while(s<=e){
                int mid = (s+e)/2;

                if (arr[mid] > target) {
                    e = mid -1;
                }else if(arr[mid] < target){
                    s = mid +1;
                }else{
                    l = mid;
                    e = mid-1;
                }
            }

            sb.append(r-l+1).append(" ");
        }

        System.out.println(sb);
        br.close();
    }
}
