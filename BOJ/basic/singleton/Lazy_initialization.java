package singleton;
import java.util.Objects;
public class Lazy_initialization {
    private static Lazy_initialization instacne;
    private Lazy_initialization(){}
    public static Lazy_initialization getInstance(){
        if(Objects.isNull(instacne)){
            instacne = new Lazy_initialization();
        }
        return instacne;
    }
}
