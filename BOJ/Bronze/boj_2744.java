import java.io.*;

public class boj_2744 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        //입력받은 문자열 소문자 대문자 바꾸기
        String test = br.readLine();
        char[] arr;
        //char 배열 로 test를 넣어라
        arr = test.toCharArray();
        for(int i=0; i<arr.length; i++){
            char c = arr[i];
            //c가 대문자이면
            if(Character.isUpperCase(c)==true){
                arr[i] = Character.toLowerCase(c);
            }else{
                arr[i] = Character.toUpperCase(c);
            }
        }
        bw.write(arr);
        bw.close();
        br.close();
    }
}
