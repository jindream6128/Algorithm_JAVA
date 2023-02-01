package boj_11659;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n+1];
        int[] prefix = new int[n+1];

        st = new StringTokenizer(br.readLine());
        for(int i = 1; i<n+1;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        prefix[0] = 0;
        for(int i = 1; i<n+1;i++){
            prefix[i] = prefix[i-1]+arr[i];
        }

        for(int tc = 0; tc<m;tc++){
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            System.out.println(prefix[j]-prefix[i-1]);
        }
     br.close();
    }
}
