package singleton;
// 1번 이른 초기화
public class EagerSingleton {
    private static EagerSingleton instance = new EagerSingleton();

    private EagerSingleton(){}
    public static EagerSingleton getInstance(){
        return instance;
    }
}
