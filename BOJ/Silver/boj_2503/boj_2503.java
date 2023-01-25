package boj_2503;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_2503 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int tc = Integer.parseInt(br.readLine());
        int[] num = new int[tc + 1];
        int[] strikecnt = new int[tc + 1];
        int[] ballcnt = new int[tc + 1];

        //입력 전부 받음
        for (int tcc = 1; tcc < tc + 1; tcc++) {
            st = new StringTokenizer(br.readLine());
            num[tcc] = Integer.parseInt(st.nextToken());
            strikecnt[tcc] = Integer.parseInt(st.nextToken());
            ballcnt[tcc] = Integer.parseInt(st.nextToken());
        }

        //완탐
        int ans = 0;
        int tmp;

        for (int i = 123; i < 988; i++) {
            //1의 자리 비교
            tmp = i % 10;

            for (int j = 1; j < tc + 1; j++) {
                int s=0;
                int b=0;
                int numj = num[j];
                //1의자리 == 1의자리
                if (tmp == (numj % 10)) {
                    s++;
                }
                //10의자리
                else if (tmp == (numj/10)%10){
                    b++;
                }
                //10의자리
                else if (tmp == (numj/100)){
                    b++;
                }

                //10의자리 == 1의자리
                if ((i/10)%10 == numj%10){
                    b++;
                }
                //10의자리 == 10의자리
                else if ((i/10)%10 == (numj/10)%10){
                    s++;
                }
                //10의자리 == 100의자리
                else if ((i/10)%10 == (numj/100)){
                    b++;
                }

                //100의자리 ==1의자리
                if ((i/100) == numj%10){
                    b++;
                }
                //100의자리 == 10의자리
                else if ((i/100) == (numj/10)%10){
                    b++;
                }
                //100의자리 == 100의자리
                else if ((i/100) == (numj/100)){
                    s++;
                }

                if(s==strikecnt[j] && b== ballcnt[j]){
                    ans++;
                }
            }
        }
        System.out.println(ans);
        br.close();
    }
}