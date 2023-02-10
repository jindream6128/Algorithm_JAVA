package boj_3020_;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class boj_3020_ {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        //n은 항상 짝수 n줄의 크기
        //장애물의 크기 h
        int n = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        int cnt =0;

        //밑에서 위로 올라가는 석순
        ArrayList<Integer> arrUp = new ArrayList<>();
        //위에서 밑으로 내려가는 종유석
        ArrayList<Integer> arrDown = new ArrayList<>();

        for(int i =0; i< n/2;i++){
            arrUp.add(Integer.parseInt(br.readLine()));
            arrDown.add(Integer.parseInt(br.readLine()));
        }
        arrUp.sort(Integer::compareTo);
        arrDown.sort(Comparator.reverseOrder());

        int u =0;
        int d =0;
        int minans = Integer.MAX_VALUE;
        for (int i = 1; i < h+1; i++) {
            // 현재 비행중인 높이를 갈 때 몇 개를 그냥 패스할 수 있는지 체크한다.
            while (arrUp.size() - u > 0 && arrUp.get(u) < i)
                u++;
            // 현재 비행중인 높이를 갈 때 몇 개와 만나는지 체크한다.
            while (arrDown.size() - d > 0 && h - arrDown.get(d) < i)
                d++;
            int collepse = arrUp.size() - u + d;
            if (minans > collepse) {
                minans = collepse;
                cnt = 1;
            } else if (minans == collepse)
                cnt++;
        }
        System.out.print(minans + " " + cnt);
    }
}
