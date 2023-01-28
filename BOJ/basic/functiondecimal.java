import java.io.IOException;

public class functiondecimal {

    static boolean is_prime(long n){
        for(long i = 2; i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws IOException{
        System.out.println(is_prime(391));
    }
}
