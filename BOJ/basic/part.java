public class part {
    static int[] arr = {0,0,0,0,3,4,5,6,7,10};

    public static void main(String[] args){
        part p = new part();

        p.manyValue();
    }

    public void manyValue(){
        int[] Cnt = new int[101];

        for(int i = 0 ;i<arr.length; i++){
            Cnt[arr[i]]++;
        }
        for(int num: Cnt){
            System.out.print(num + " ");
        }
    }
}
