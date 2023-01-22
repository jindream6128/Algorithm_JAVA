import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_2725 {
    //모두 보일려면 겹치는 기울기가 있어서는 안된다 !
    // 따라서 서로 다른 기울기를 가지는 좌표의 갯수를 전부 구하면 된다.
    // 서로다른 기울기 -> 분모, 분자의 최대공약수가 1인 수를 찾으면 된다.

    //최대공약수 구하기 gcd
    static int gcd(int a, int b){
        int tmp;
        //항상 앞에가 더 크도록
        if(a<b){tmp = b; b=a;a=tmp;}
        while(a%b>0){
            //a%b!=0
            tmp =b;
            b = a%b;
            a = tmp;
        }
        return b;
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        for(int i = 0; i <tc;i++){
            int n = Integer.parseInt(br.readLine());
            int cnt = 0; // 기울기가 1인거 한개
            for(int a = 1; a<n+1;a++){
                //b는 a까지만 돌고 나중에 *2해주기
                for(int b = 1;b<a;b++){
                    //만약 최대공약수가 1이면 기울기가 다른거이므로 cnt +1
                    if(gcd(a,b)==1){
                        cnt++;
                    }
                }
            }
            //기울기가 1인거랑, x,y축 에 올라가있는거 각 1개씩 총2개
            System.out.println(cnt*2+3);
        }

        br.close();
    }
}
