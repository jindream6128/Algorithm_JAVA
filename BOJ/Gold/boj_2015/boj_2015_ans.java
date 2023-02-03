package boj_2015;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class boj_2015_ans {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        long answer = 0;
        Map<Integer, Long> map = new HashMap<>();
        //-> 정수타입의 key로  long타입의 value를 찾는다

        st = new StringTokenizer(br.readLine());
        int[] sum = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            sum[i] = sum[i - 1] + Integer.parseInt(st.nextToken());

            if (sum[i] == K) {
                answer++;
            }
        }

        for (int i = 1; i <= N; i++) {
            if (map.containsKey(sum[i])) {
                map.put(sum[i], map.get(sum[i]) + 1);
            } else {
                map.put(sum[i], 1L);
            }
            ////지금 내생각은 위에 sum[i]를 모두map에 박아줘야해이렇게
        }
        //그리고 포함하는지 확인을해야하는거 아닌가?
        for(int i =1 ;i<=N ; i++){
            if (map.containsKey(sum[i] - K)) {
                answer += map.get(sum[i] - K);
            }
        }

        System.out.println(answer);
    }
}
