package Gold.boj_1407;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_1407 {

    static int function(long n){
        long num = n;
        int cnt =0;
        while(num % 2 ==0){
            cnt++;
            num = num/2;
        }
        if(cnt == 0){
            return 1;
        }
        int ans =1;
        if(cnt>0){
            for(int i =0 ; i<cnt;i++){
                ans=ans*2;
            }
        }
        return ans;
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
            st = new StringTokenizer(br.readLine());
            long a = Long.parseLong(st.nextToken());
            long b = Long.parseLong(st.nextToken());
            int result = 0;

            for (long i = a; i <= b; i++) {
                result += function(i);
            }
            System.out.println(result);
            br.close();
    }
}
