package singleton;
public class Double_checked_locking {
    private static Double_checked_locking instacne;
    private Double_checked_locking(){};
    public static Double_checked_locking getInstance(){
        if(instacne ==null){
            synchronized (Double_checked_locking.class){
                if(instacne == null){
                    instacne = new Double_checked_locking();
                }
            }
        }
        return instacne;
    }
}

