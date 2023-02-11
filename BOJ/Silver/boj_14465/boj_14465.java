package boj_14465;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_14465 {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int[] arr = new int[n+1];
        //고장난곳 1로 바꾸기
        for(int i = 0 ;i<b; i++){
            arr[Integer.parseInt(br.readLine())] = 1;
        }
        int cnt = 0;
        for(int i =1; i<=k;i++){
            //처음부터 k만큼 고장난 부분 찾기.
            if(arr[i]==1){
                cnt++;
            }
        }
        int ans = cnt;
        //처음 cnt는 미리 구했고, 이 for문을 돌면 처음 밀렸을때 즉 2~7까지의 범위를 확인한다.
        for(int i =1;i<n-k+1;i++){
            //시작점이 고장난거라면 한칸 밀릴테니까 빼준다
            if(arr[i]==1){
                cnt--;
            }
            //끝이 고장난 부분이라면 cnt++해주기
            if(arr[i+k]==1){
                cnt++;
            }
            //그리고 최솟값은 항상 갱신해주기
            ans = Math.min(ans,cnt);
        }

        System.out.println(ans);
        br.close();
    }
}
