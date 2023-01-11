import java.io.*;
import java.util.Arrays;

public class boj_2309_2 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int sum = 0;
        int[] arr = new int[9]; //0 1 2 3 4 5 6 7 8 난쟁이의 키가 저장될 9개의 배열 생성

        //난쟁이의 키 입력받고, 전체 합 구함
        for (int i = 0; i < 9; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }

        //2개씩 모두 빼본다음 100이되는 값을 찾는다
        for (int a = 0; a < 8; a++) {
            for (int b = a + 1; b < 9; b++) {
                if ((sum - arr[a] - arr[b]) == 100) {
                    //두명을 뺐을때 키의 합이 100 일때
                    //arr배열에서 두명의 난쟁이를 빼라 -> 0으로 만듬
                    arr[a] = 0;
                    arr[b] = 0;
                    Arrays.sort(arr); //오름차순 정렬
                    for (int j = 2; j < 9; j++) {
                        bw.write(String.valueOf(arr[j]));
                        bw.newLine();
                    }
                    //BufferedWriter을 똑바로 close 하지 않으면 출력이 제대로 되지 안흔다.
                    bw.close();
                    return;
                }
            }
        }
        br.close();
    }
}
