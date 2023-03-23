package ThisIsJavaTest;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.StringTokenizer;

public class ex1 {
    //이름, 나이, 오늘생일, 성별, 지역, 띠, 나이평균, 나이별 정렬, 성씨별 인원수

    StringTokenizer st;
    String[] member = {"공지현#961210-1010678#051)234-8910",
            "김가영#990119-2010678#02)934-8910",
            "김민준#580219-1010978#031)734-8910",
            "김병훈#880323-1910678#02)634-8910",
            "박규민#960210-1010678#051)234-8910"};
    //member.length = 5
    int k = member.length;
    //이름 객체
    String[] name = new String[k];

    //주민번호 객체
    String[] ssn = new String[k];

    //나이 객체
    int[] age = new int[k];

    //전화번호 객체
    String[] pn = new String[k];

    String[] BrithdayChk = new String[k];
    //한개씩 쪼개서 name 객체에 넣기
    public void tc(String[] m) {
        ex1 o = new ex1();
        for(int i= 0 ; i<k;i++) {
            st = new StringTokenizer(o.member[i], "#");
            this.name[i] = st.nextToken();
            this.ssn[i]=st.nextToken();
            this.pn[i]=st.nextToken();
        }
    }


    //나이
    public void ageCalc(){
        Calendar now = Calendar.getInstance();
        int year = now.get(Calendar.YEAR); //year 2023
       for(int i = 0; i<k;i++){
            String tmp = ssn[i];
            int tmp1 = Integer.parseInt(tmp.substring(0,2));
            age[i] = year - (tmp1 + 1900) + 1 ;
        }

    }

    //오늘 생일인지
    public void BirthdayCheck(){
        Calendar now = Calendar.getInstance();
        //1월이 0이다
        //월
        int mon = now.get(Calendar.MONTH)+1;
        //날짜
        int day = now.get(Calendar.DATE);

        int md = mon+1000+day;

        for(int i = 0; i<k;i++){
//            String tmp = ssn[i];
//
//            int tmp1 = Integer.parseInt(tmp.substring(2,6)); // 990225 에서 0225를 잘라왔다 정수형으로
//
//            if(tmp1 == md){
//                BrithdayChk[i] = "오늘 생일입니다.";
//            }else{
//                BrithdayChk[i] = "오늘 생일이 아닙니다.";
//            }
//
        }

    }

    //성별

    //지역

    //띠

    //나이평균

    //나이별 정렬

    //성씨별 인원수
    public static void main(String[] args) {
        ex1 o = new ex1();
        o.printAns();
    }

    public void printAns(){
        ex1 o = new ex1();
        //쪼개서 3개의 객체에 넣기
        o.tc(member);

        o.ageCalc();
        BirthdayCheck();

        System.out.println("<이름>");
        //이름 출력
        for(String str : o.name){
            System.out.print(str+" ");
        }
        System.out.println();

        System.out.println();
        //나이를 출력
        System.out.println("<나이>");
        for(int i: o.age){
            System.out.print(i+" ");
        }
        System.out.println();

        System.out.println();

        System.out.println("<오늘 생일 여부>");
        for(String s : o.BrithdayChk){
            System.out.print(s+ " ");
        }
        System.out.println();

    }
}


/*
 * //2차원 배열 //한줄 읽고 -> #을 기준으로 배열에 넣어라 // #을 기준으로 3개 쪼개기 // [5][3] -> String
 * String[][] arr = new String[5][3];
 *
 * //쪼개서 배열에 넣기 public void tc(String[] m){ for(int i=0; i<member.length;i++) {
 * String tmp = member[i]; arr[i] = tmp.split("#"); } }
 */