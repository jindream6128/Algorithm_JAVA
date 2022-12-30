public class Test3 {
    public static void main(String[] args) {
        double nominal = 1.0;
        double sum = 0.0;

        for (int i = 0; i < 10; i++) {
            sum += 0.1;
        }
        if (nominal == sum) {
            System.out.println("Same" + sum);
        } else {
            System.out.println("Different" + sum);
        }
    }

}
