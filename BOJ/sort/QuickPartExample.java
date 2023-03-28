public class QuickPartExample {
    static int[] arr = {30,2,1,5,3,364,542,213};

    public static void main(String[] args){
        int pivot = arr[arr.length/2];
        int start = 0;
        int end = arr.length-1;

        while(arr[start]<pivot) start ++;
        while(arr[end]>pivot) end--;

        if(arr[start]>arr[end]){
            int tmp;
            tmp = arr[end];
            arr[end] = arr[start];
            arr[start] = arr[end];

            start++;
            end--;
        }

        for(int num: arr){
            System.out.println(num);
        }
    }
}

