import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_2725 {
    //모두 보일려면 겹치는 기울기가 있어서는 안된다 !
    // 따라서 서로 다른 기울기를 가지는 좌표의 갯수를 전부 구하면 된다.
    // 서로다른 기울기 -> 분모, 분자의 최대공약수가 1인 수를 찾으면 된다.

    //최대공약수 구하기 gcd


    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        for(int i = 0; i <tc;i++){
            int n = Integer.parseInt(br.readLine());
        }

        br.close();
    }
}
