package boj_2908;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_2908 {
    static int reverse(int num){
        int ans =0;
        //1의자리
        int firstnum = num%10;
        //10의자리
        int secondnum = (num/10)%10;
        //100의자리
        int thirdnum = num/100;

        ans = 100*firstnum + 10*secondnum + thirdnum;
        return ans;
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int a = reverse(Integer.parseInt(st.nextToken()));
        int b = reverse(Integer.parseInt(st.nextToken()));
        System.out.println(Math.max(a,b));

        br.close();
    }
}
