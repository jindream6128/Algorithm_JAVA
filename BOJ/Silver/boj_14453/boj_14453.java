package boj_14453;

import javax.xml.stream.events.Characters;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_14453 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String[] arr = new String[n+1];
        for(int i = 1 ; i<n+1;i++){
            arr[i] = br.readLine();
        }
        int[] Psum = new int[n+1];
        int[] Hsum = new int[n+1];
        int[] Ssum = new int[n+1];
        for(int i =1; i<n+1;i++){
            if(arr[i].equals("P")){
                Psum[i]++;
            }else if (arr[i].equals("H")){
                Hsum[i]++;
            }else if(arr[i].equals("S")){
                Ssum[i]++;
            }
            Psum[i] += Psum[i-1];
            Hsum[i] += Hsum[i-1];
            Ssum[i] += Ssum[i-1];
        }
        //우선  ans에는 끝에 각 PHS 누적합한거 중에 최댓값 저장하기.
        int ans = Math.max(Psum[n],Math.max(Hsum[n],Ssum[n]));

        for(int i =1; i<n+1;i++){
            //왼쪽 확인
            int prefix = Math.max(Psum[i],Math.max(Hsum[i],Ssum[i]));
            //뒤에서부터 오른쪽 확인 -> 끝에값 에서 현재값을 뺀다면 지금 기준에서 끝까지 몇번 더 승리할수 있는지 확인 가능하다.
            int suffix = Math.max(Psum[n]-Psum[i],Math.max(Hsum[n]-Hsum[i],Ssum[n]-Ssum[i]));
            //ans과, 한번만 바꾸었을때 -> 즉 왼쪽과 오른쪽의 합 (왼쪽 prefix는 바꾸기 전, 오른쪽 suffix는 바꾼뒤)
            ans = Math.max(ans, prefix+suffix);
        }

        System.out.println(ans);
        br.close();
    }
}
