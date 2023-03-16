import java.io.*;

public class example {
    public static void main(String[] args){
        int[] arr = {10,30,20,450,120,12};

        int tmp=0;

        for(int i =0; i<arr.length;i++){
            for(int j =1; j<arr.length-1 ; j++){
                if(arr[j-1]>arr[j]){
                    tmp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = tmp;
                }
            }
        }

    }


}
