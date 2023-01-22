import java.util.Scanner;

public class gcd {
    static int gcd(int a, int b){
        int tmp;

        // Always a > b
        if (a < b) { tmp = b; b = a; a = tmp; }
        tmp = a % b; //a,b 의 크기는 상관없음 3%5 =3 5%3 =2
        //tmp 즉 나머지가 0일떄 까지 돌린다
        while (a % b > 0){
            tmp = b; // a (tmp)
            b = a % b; // b
            a = tmp;
        }
        return b;
        // a>b일때 한정, 아니면 두개 바꿔서 생각
        //(a,b) -> (a%b, b)
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = gcd(a,b);
        System.out.println(result);

    }

}
