package boj_2661;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_2661 {
    static int n;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());


        br.close();
    }

    static void recur(String str){
        if(str.length()==n){
            sb.append(str);
            return;
        }

//        for(int i =1;)
    }
}
