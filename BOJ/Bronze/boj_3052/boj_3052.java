package boj_3052;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class boj_3052 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer[] arr = new Integer[10];
        for(int i = 0; i<10; i++){
            int n = Integer.parseInt(br.readLine());
            arr[i] = n%42;
        }

        //int형의 list set으로 바꾸기
        Set<Integer> arrset = new HashSet<Integer>(Arrays.asList(arr));

        System.out.println(arrset.size());
    }
}
