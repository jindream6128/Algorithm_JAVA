package singleton;
public class Bill_Pugh_solution {
    private Bill_Pugh_solution() { }
    // 인스턴스를 리턴할 Holder 클래스 생성하기
    private static class Bill_Pugh_solution_Hordler {
        private static final Bill_Pugh_solution instance = new Bill_Pugh_solution();
    }
    public static Bill_Pugh_solution getInstance() {
        return Bill_Pugh_solution_Hordler.instance;
    }
}