package singleton;
//2번 생성자 private static영역에 예외처리
public class Static_block_initialization {
    private Static_block_initialization(){};
    private static Static_block_initialization instacne;
    static{
        try {
            instacne = new Static_block_initialization();
        }catch(Exception e){
            throw new RuntimeException(" 싱글톤 객체를 만들수 없습니다");
        }
    }
    public static Static_block_initialization getInstance(){

        return instacne;
    }
}
