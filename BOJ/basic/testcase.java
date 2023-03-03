import java.io.*;
import java.util.*;

public class testcase {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int k = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < k; i++) {
            arr.add(Integer.parseInt(br.readLine()));
        }
        Collections.sort(arr);
        //max값
        long e = arr.get(k-1);
        //시작값은 1
        long s = 1;
        long ans = 0;
        while(s<=e){
            long mid = (e+s) /2;

            long cnt = 0; //cnt 가 >=n일떄의 target값

            for(int i = 0 ; i<k ; i++){
                cnt += (arr.get(i) / mid);
            }

            if(cnt < n) {
                e = mid-1;
            }if(cnt >= n){
                ans = mid;
                s = mid +1;
            }

        }


        System.out.println(ans);
        br.close();
    }
}
