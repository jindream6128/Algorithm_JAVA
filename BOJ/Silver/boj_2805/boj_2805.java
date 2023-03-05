package boj_2805;
import java.io.*;
import java.util.*;

public class boj_2805 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        //나무의 수
        int n = Integer.parseInt(st.nextToken());
        //집에 가지고 가야하는 나무길이
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());

        //두번째 줄까지 각 나무길이 까지 입력
        for(int i =0 ;i < n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        int min = 0;
        int max = arr[n-1];

        while(min<=max){
            long tmpSum = 0;
            int mid = (min + max) /2;
            for(int i = 0; i<n; i++){
                if((arr[i] - mid) >0){
                    tmpSum += (arr[i] - mid);
                }
            }

            if(tmpSum < m){
                max = mid -1;
            }else{
                min = mid +1;
            }
        }

        System.out.println(min-1);

        br.close();
    }
}
