package ThisIsJavaTest;

import java.util.*;

public class Parent {
public static void main(String[] args){
    ArrayList<String> duplicate_data = new ArrayList<String>();
    duplicate_data.add("hihihi");
    duplicate_data.add("hihihi");
    duplicate_data.add("hihihi");
    duplicate_data.add("hello");
    duplicate_data.add("hello");
    duplicate_data.add("Java");
    duplicate_data.add("Java");
    duplicate_data.add("Yang");
    duplicate_data.add("Yang's blog");
    duplicate_data.add("Yang's blog");

    HashMap<String, Integer> duplicate_count = new HashMap<String, Integer>();

    for(int i = 0 ; i < duplicate_data.size() ; i++){ // ArrayList 만큼 반복
        if (duplicate_count.containsKey(duplicate_data.get(i))) { // HashMap 내부에 이미 key 값이 존재하는지 확인
            duplicate_count.put(duplicate_data.get(i), duplicate_count.get(duplicate_data.get(i))  + 1);  // key가 이미 있다면 value에 +1
        } else { // key값이 존재하지 않으면
            duplicate_count.put(duplicate_data.get(i) , 1); // key 값을 생성후 value를 1로 초기화
        }
    }

    System.out.println(duplicate_count);
}
}
