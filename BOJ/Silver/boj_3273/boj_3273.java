package boj_3273;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class boj_3273 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st ;
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n+1];
        st = new StringTokenizer(br.readLine());
        for(int i = 1; i<= n;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        //찾아야하는 sum값 x
        int x = Integer.parseInt(br.readLine());

        int cnt = 0;
        int L = 1, R = n;
        int v1=0, v2=0;

        while(L<R){
            int sum = arr[L]+arr[R];
            // sum==x이면  cnt+1
            if(sum == x){
                cnt ++;
            }

            //sum이 x보다 크면 R을 왼쪽으로 한칸
            if(sum>x){
                R--;
                //sum이 x보다 작으면 L을 오른쪽으로 한칸
                //여기서 sum 같은경우도 생각하기, 위에서 sum = x일때 cnt해주기때문에
                //나머지 sum<=x일때는 그냥 L++해주면 된다.
            }else{
                L++;
            }
        }


        System.out.println(cnt);
        br.close();
    }
}
