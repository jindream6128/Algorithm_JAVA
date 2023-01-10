import java.io.IOException;
import java.util.Scanner;

public class boj_16283 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt =0;
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();
        int w = sc.nextInt();
        int sheepnum = 0;//양
        int goatnum = 0;//염소

        for(int i = 1; i <= n-1; i ++){
            for(int j = 1; j <= n-1 ; j++) {
                if (i + j == n) {
                    if (((a * i) + (b * j)) == w) {
                        sheepnum = i;
                        goatnum =j;
                        cnt += 1;
                    }
                }
            }
        }

        if (cnt == 1){
            System.out.println(sheepnum+" "+goatnum);
        }
        else {
            System.out.println("-1");
        }
    }
}