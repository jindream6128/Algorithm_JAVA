package boj_3733;

import java.io.*;
import java.util.*;

public class boj_3733 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n,s ;
        //다음 데이터가 있으면 반복
        while(sc.hasNext()){
            n = sc.nextInt();
            s = sc.nextInt();
            System.out.println(s/(n+1));
        }
    }
}
