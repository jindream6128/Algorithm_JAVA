package boj_4153;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_4153 {
    static boolean triangle(int i, int j, int k){
        int a = i*i;
        int b = j*j;
        int c = k*k;
        if(((a+b)==c)||((a+c)==b)||((b+c)==a)){
            return true;
        }
        return false;
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        while(true){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b= Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            boolean ans;
            if(a==0&&b==0&&c==0){
                System.out.println(sb);
                break;
            }
            ans = triangle(a,b,c);
            if(ans){
                sb.append("right").append("\n");
            }
            if(!ans){
                sb.append("wrong").append("\n");
            }

        }

        br.close();
    }
}
