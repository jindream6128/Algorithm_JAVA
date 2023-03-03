package boj_16498;
import java.io.*;
import java.util.*;

public class boj_16498 {
    static int max(int a, int b, int c){
        int ans=a;
        if(a<b){
            ans = b;
            if(b<c){
                ans =c;
            }
        }
        return ans;
    }
    static int min(int a,int b, int c){
        int ans = a;
        if(b<a){
            ans = b;
            if(c<b){
                ans = c;
            }
        }
        return ans;
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        List<Integer> arrA = new ArrayList<>();
        List<Integer> arrB = new ArrayList<>();
        List<Integer> arrC = new ArrayList<>();

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i<a; i++){
            arrA.add(Integer.parseInt(st.nextToken()));
        }

        st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i<b; i++){
            arrB.add(Integer.parseInt(st.nextToken()));
        }

        st = new StringTokenizer(br.readLine());
        for(int i =0; i<c; i++){
            arrC.add(Integer.parseInt(st.nextToken()));
        }

        Collections.sort(arrA);
        Collections.sort(arrB);
        Collections.sort(arrC);

        //mid index 을 구해보자
        int[] arr = new int[] {a/2,b/2,c/2};
        Arrays.sort(arr);


        br.close();
    }
}
