package boj_2015;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;

public class boj_2015 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        Map<Integer, Long> map = new HashMap<>();
        long ans = 0;

        int[] prefix = new int[n + 1];
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i < n + 1; i++) {
            prefix[i] = prefix[i - 1] + Integer.parseInt(st.nextToken());

            //누적합 중에 k랑 같은게 있으면 cnt해준다
            if (prefix[i] == k) {
                ans++;
            }
        }
        //이렇게 완탐 돌리면 O(n^2) n<200,000이므로 시간초과
        /*
        for(int i =1;i<n;i++){
            for(int j =i+1; j<n+1;j++){
                if((prefix[j]-prefix[i])==k){
                    ans++;
                }
            }
        }
        */

        for (int i = 1; i < n + 1; i++) {
            if(map.containsKey(prefix[i])){
                map.put(prefix[i], map.get(prefix[i]) + 1);
            }else{
                map.put(prefix[i],1L);
            }
        }

        for(int i =1;i<n+1;i++){
            if(map.containsKey(prefix[i] - k)){
                ans += map.get(prefix[i]-k);
            }
        }

        System.out.println(ans);


        br.close();
    }
}
