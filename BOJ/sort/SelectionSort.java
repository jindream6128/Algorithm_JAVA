import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SelectionSort {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for(int k = 0;k<n;k++){
            arr[k] = Integer.parseInt(br.readLine());
        }
        int indexMin, tmp;
        for(int i = 0;i<arr.length;i++){
            indexMin = i;
            for(int j = i+1;j<arr.length;j++){
                if(arr[j] < arr[indexMin]){
                    indexMin = j;
                }
            }
            tmp = arr[indexMin];
            arr[indexMin] = arr[i];
            arr[i] = tmp;

        }
        for(int num : arr){
            System.out.println(num);
        }
    }
}
