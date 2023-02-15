package boj_4673;

import java.util.Arrays;

public class boj_4673 {

    static boolean[] num = new boolean[10_001];

    //dn구하기
    static int dn(int n){
        //각 자리를 구하기 최대 5자리이니까 5개 배열 구하고 거기에 넣기
        int[] arr = new int[5];
        int i =0;
        while (n > 0) {
            arr[i] = n%10;
            n = n/10;
            i++;
        }
        int ans = n;
        for(int j = 0; j<5;j++){
            ans += arr[j];
        }
        return ans;
    }

    public static void main(String[] args){
        StringBuilder sb = new StringBuilder();

        for(int i = 1; i<=10_000;i++){
            num[dn(i)] = true;
        }
        for(int i = 1;i<=10_000;i++){
            if(num[i] == false){
                sb.append(i).append("\n");
            }
        }
        System.out.println(sb);
    }
}

