import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_15996_answer {
    //팩토리얼 구현
//    public static long factorial(int n){
//        if(n<=1){
//            return n;
//        }
//        else{
//            return factorial(n-1) * n;
//        }
//
//    }

    //정수론 이용
    //n!이 소수 x의 배수의 갯수인지 구할때 -> O(log n)이다.
    // 20까지 x가 몇개들어있는지 확인하기 -> n/a
    // 그리고 그다음 n까지 a*a가 몇개들어있는지 확인하기 이렇게 check;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long n = Long.parseLong(st.nextToken());
        long a = Long.parseLong(st.nextToken());
        long k = 0;
        long temp = a;
        while(temp<=n){
            k = k+(n/temp);
            temp = temp * a;
        }

        System.out.println(k);

    }
}
