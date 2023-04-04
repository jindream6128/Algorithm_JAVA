package singleton;
public class Thread_safe_initialization {
    private static Thread_safe_initialization instacne;
    private Thread_safe_initialization(){}
    public static synchronized Thread_safe_initialization getInstance(){
        if(instacne == null){
            instacne = new Thread_safe_initialization();
        }
        return instacne;
    }
}
