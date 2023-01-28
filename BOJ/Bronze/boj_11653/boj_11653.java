package boj_11653;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class boj_11653 {
    //소수 판별하기
//    static boolean is_prime(long n){
//        for(long i =2; i*i<=n;i++){
//            if(n%i==0){return false;}
//        }
//        return true;
//    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());


        for(int i =2;i*i<=n;i++){
            while(n%i==0){
                System.out.println(i);
                n/=i;
            }
        }

        //나누고나서 마지막에는 1이된다
        if(n != 1){
            System.out.println(n);
        }

        br.close();
    }
}
