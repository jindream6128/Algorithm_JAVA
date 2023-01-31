package boj_1546;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class boj_1546 {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc= Integer.parseInt(br.readLine());
        double [] arr = new double[tc];

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        for(int i=0;i<tc;i++){
            arr[i]= Double.parseDouble(st.nextToken());
        }

        double sum =0;
        Arrays.sort(arr);
        for(int i=0;i<tc;i++){
            sum += arr[i];
        }
        double ans = (sum/arr[arr.length-1]) * 100;
        System.out.println(ans/tc);
        br.close();
    }
}
