package boj_13702;
import java.io.*;
import java.util.*;

public class boj_13702 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        //막걸리 갯수 n
        //나누어 줘야할 사람의 갯수 k
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        //막걸리 넣기
        int[] arr = new int[n];
        for(int i= 0; i<n;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);

        long min =0;
        //max값을 그냥 Integer.Max_value로 생각
        long max = Integer.MAX_VALUE;
        long ans = 0;
        while(min <= max){
            long mid = (min + max)/2;
            int cnt = 0;
            for(int i =0;i<n;i++){
                cnt += (arr[i]/mid);
            }
            if(cnt>=k){
                ans = mid;
                min = mid +1;
            }else{
                max = mid -1;
            }

        }
        System.out.println(ans);

        br.close();
    }
}
