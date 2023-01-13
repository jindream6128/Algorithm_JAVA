import java.io.*;
import java.util.StringTokenizer;

import static java.lang.Math.max;

public class boj_15593_re {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int[] start = new int[101]; //index 1번부터 바로 사용하려고 101개 생성 최대는 100
        int[] end = new int[101]; //index 1번부터 바로 사용하려고 101개 생성 최대는 100

        //arr[시간] 시간에 몇명이 근무하는지check
        int[] arr = new int[1001];

        //start end 값을 받고, 그 근무시간에 몇명이 근무하는지 확인한다
        for (int i = 1; i <= n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            start[i] = Integer.parseInt(st.nextToken());
            end[i] = Integer.parseInt(st.nextToken());
            for (int j = start[i]; j < end[i]; j++) {
                arr[j] += 1;
            }
        }
        //좌표가아니라 범위가 되야한다 마지막 end값을 포함해버리면 범위가 조건에 맞지않다!!! 주의할것!!
        int result = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = start[i]; j < end[i]; j++) {
                // i일때 하나씩 전부 뺸거 생각
                arr[j] -= 1;
            }
            int num = 0;
            for (int k = 1; k < 1001; k++) {
                if (arr[k] != 0) { //해당시간에 1명이라도 존재할떼 2명이던 3명이던 동일한경우이다.
                    num++; //1씩 더한다
                }
                //비교 각기 다른시간에서 더 많은 사람이 올수 있는 경우
                result = max(result, num);
            }
            for(int x = start[i]; x<end[i];x++)
                arr[x] +=1; //빼기전으로 복구
            }


        bw.write(String.valueOf(result));
        br.close();
        bw.flush();
    }
}
