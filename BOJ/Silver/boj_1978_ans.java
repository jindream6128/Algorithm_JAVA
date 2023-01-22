import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_1978_ans {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int check = 0;
        int count =0;
        for(int i =0;i<n;i++){
              check = Integer.parseInt(st.nextToken());
              if(isPrime(check)){
                  count ++;
              }
        }
        System.out.println(count);
    }

    static boolean isPrime(int num){
        if(num == 1){
            return false;
        }
        for(int i =2; i*i<=num; i++){
            if(num%i== 0){
                return false;
            }
        }
        return true;
    }
}
