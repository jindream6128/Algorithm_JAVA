package boj_2015;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;

public class boj_2015_ans {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

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

        Map<Integer, Long> map = new HashMap<>();
        for(int i =1; i<=n;i++){
            //prefix[j]-prefix[i] = k이다. 여기서 prefix[j]-k = prefix[i]라는 식을 얻을수 있다.
            //즉 prefix를 통해 K가 될수있는 값이 있다면 ans에 그 갯수만큼 더해준다. map(key,value)에서 value가 있는 경우의 key를 찾아서 더한다.
            // 즉 map의 value는 곧 갯수가 되고 그 갯수를 더해준다.
            if(map.containsKey(prefix[i]-k)){
                ans += map.get(prefix[i]-k);
            }

            //누적합들을 map에 추가하기
            if(map.containsKey(prefix[i])){
                map.put(prefix[i],map.get(prefix[i])+1);
            }else{
                map.put(prefix[i],1L); // map이 <Integer, Long>이므로 Long형으로 바꿔준다
            }

        }


        System.out.println(ans);


        br.close();
    }
}
