package boj_2467;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_2467 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n  = Integer.parseInt(br.readLine());
        int[] arr = new int[n+1];

        //용액 입력
        st = new StringTokenizer(br.readLine());
        for(int i = 1 ; i<=n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int L=1,R=n;
        int best_sum = arr[1]+arr[n];
        int index1=1,index2=n;

        while(L<R){
            int sum = arr[L]+arr[R];
            if(Math.abs(sum)<Math.abs(best_sum)){
                best_sum = sum;
                index1 = L;
                index2 = R;
            }

            //여기서 L==R은 같을수 없다 왜냐하면 두개의 용액을 합치는거기 때문에 반드시 L<R이여야 한다.
            //그래서 그냥 sum이 0보다 크거나, 작거나로 판단했고, sum == 0이더라도 어짜피 오름차순으로 돌아야 하기때문에 끝까지 확인해야 한다.
            if(sum>0){
                R--;
            }else{
                L++;
            }
        }
        System.out.print(arr[index1] +" "+ arr[index2]);

        br.close();
    }
}
