import java.time.LocalDate;
import java.time.ZoneId;

public class boj_10699 {
    public static void main(String[] args){
        LocalDate seoulDate = LocalDate.now(ZoneId.of("Asia/Seoul"));
        System.out.println(seoulDate);

    }
}
