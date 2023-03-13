import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;

public class test1 {
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        char[] arr = {'a','t','c','i','s','w'};
        Arrays.sort(arr);
        for(char str :arr){
            sb.append(str);
        }
        System.out.println(sb);
    }


}
