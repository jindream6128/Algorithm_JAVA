package boj_2792;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class boj_2792 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        //아이들 수 n;
        int n = Integer.parseInt(st.nextToken());
        //생상의 수 m
        int m  = Integer.parseInt(st.nextToken());
        //생상의수 받기
        int[] arr = new int[m];
        for(int i =0 ; i<m;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        //입력받은 색상 배열 정렬

        int min =1;
        int max = arr[m-1];
        int result=0;
        //cnt는 사람수

        while(min<=max){
            int mid = (min + max)/2;
            int cnt = 0;

            for(int i = 0; i<m; i++){
                if((arr[i]%mid) == 0){
                    cnt += (arr[i]/mid);
                }else{
                    cnt +=  arr[i]/mid +1 ;
                }
            }

            if(cnt>n){
                min = mid +1;
            }else{
                max = mid -1;
                result = mid;
            }
        }

        System.out.println(result);
        br.close();
    }
}
