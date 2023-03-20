package boj_4419;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_4419 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st ;
        StringBuilder sb = new StringBuilder();

        int tc = Integer.parseInt(br.readLine());
        String[] arr = new String[tc];
        int[] num = new int[tc];

        for(int i = 0; i< tc;i++){
            arr[i] = br.readLine();
        }

        String str = br.readLine();
        //hasNext 구현
        while(str != null){
            st = new StringTokenizer(str);

            for(int i =0;i<tc;i++){
                num[i] += Integer.parseInt(st.nextToken());
            }
            str = br.readLine();
        }

        for(int k : num){
            System.out.println(k);
        }
        br.close();
    }
}
