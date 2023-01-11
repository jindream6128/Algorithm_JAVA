import java.io.*;

public class example {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = new int[9];
        int[] arr2 = {1,2,3,4,5,6,7,8,9};

        arr2[0] =0;

        for (int i =0; i<9; i++){
            System.out.println(arr2[i]);
        }

        br.close();
        bw.close();


    }
}
