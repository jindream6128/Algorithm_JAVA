import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class bronzeTest {

    public void method(int[] x){
        int[] imsi ={10,20,30,40};
        x= imsi;
    }
    public static void main(String[] args) throws IOException{
        bronzeTest a = new bronzeTest();
        int[] x = {11,12,13,14};

        a.method(x);
        System.out.println(Arrays.toString(x));
    }
}
