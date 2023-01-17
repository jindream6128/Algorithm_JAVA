import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_1978 {
    public static void main(String[] args) throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int ans = 0;
        int check;

        for(int i = 0 ; i < n; i++){
            check =Integer.parseInt(st.nextToken());
            for(long j = 2; j <=check ; j++){
                if(j == check){
                    ans++;
                }
                if(check % j == 0){
                    break;
                }
            }
        }
        System.out.println(ans);


        br.close();
    }


}
