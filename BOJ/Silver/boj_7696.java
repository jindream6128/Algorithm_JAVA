import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class boj_7696 {
    //모든 값을 넣어둘 크기가 1,000,001 list생성
    static int[] allarr = new int[1_000_001];

    static List<Integer> list = new ArrayList<>();
    static Set<Integer> listset = new HashSet<>();

    //중복값 확인
    static boolean check(int number){
        list.clear();
        while(number >0) {
            int digit = number % 10;
            list.add(digit);
            number /= 10;
        }
        listset.clear();
        listset.addAll(list);
        
        if(list.size() != listset.size()){
            return true; //두개의 리스트 크기가 다르면 중복값이 없다.
        } else {return false;} //두개의 리스트 크기가 같으면 중복값이 있다

    }

    //1 부터 1,000,000까지 돌아서 리스트에 넣어두기
    static void precal(){
        int testNum = 0;
        for(int number = 1; number<=1_000_000;){
            testNum++;
            if(check(testNum)){
                continue;
            }
            allarr[number] = testNum;
            number++;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        precal();
        while(true){
            int n = Integer.parseInt(br.readLine());
            if(n==0) break;

            bw.write(String.valueOf(allarr[n]));
            bw.newLine();
        }
        br.close();
        bw.close();
    }
}
