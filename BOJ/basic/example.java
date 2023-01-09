import java.io.*;

public class example {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String s = br.readLine();
        sb.append(s.charAt(0)*3);
        System.out.println(String.valueOf(sb));
        System.out.println(s.charAt(0));


    }
}
