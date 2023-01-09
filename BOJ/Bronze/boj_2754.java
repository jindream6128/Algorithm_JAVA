import java.io.*;

public class boj_2754 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // 전부다 if문으로 구현 가능하지만, 각 학점  ABCD를 기준으로 +-0.3차이임을 확인
        String grade = br.readLine();
        double gradenum = 0;
        char c = grade.charAt(0); //grade ABCD확인
        //앞에 ABCD 처리
        if (c=='A'){
            gradenum = 4.0;
        }else if(c=='B'){
            gradenum = 3.0;
        }else if(c=='C'){
            gradenum = 2.0;
        }else if(c=='D'){
            gradenum = 1.0;
        }else{
            //F일때는 0.0 출력하고 종료 뒤에 + -생각할 필요 없음
            //그리고 종료하기전에 bw, br close하기!
            bw.write("0.0");
            bw.close();
            br.close();
            return;
        }
        // + -처리
        c = grade.charAt(1);
        if(c=='+'){
            gradenum += 0.3;
        }else if(c=='-'){
            gradenum -= 0.3;
        }else{
            gradenum = gradenum;
        }

        bw.write(String.valueOf(gradenum));
        bw.close();
        br.close();
    }
}
