package boj_1764;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.StringTokenizer;

public class boj_1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        HashSet<String> hst = new HashSet<>();
        ArrayList<String> ans = new ArrayList<>();
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        for(int i = 0 ; i<a; i++){
            hst.add(br.readLine());
        }

        for(int i = 0 ; i<b;i++){
            String s = br.readLine();
            if(hst.contains(s)){
                ans.add(s);
            }
        }

        Collections.sort(ans);
        System.out.println(ans.size());
        for(int i =0 ;i<ans.size();i++){
            System.out.println(ans.get(i));
        }
        br.close();
    }
}
