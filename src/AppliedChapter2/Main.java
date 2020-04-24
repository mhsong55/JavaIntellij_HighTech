package AppliedChapter2;

import java.util.*;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Person gilDong = new Person("홍길동");
        Person seokBong = new Person("한석봉");
        List<Person> people = new ArrayList<>();
        people.add(gilDong);
        people.add(seokBong);
        // Map 자료형의 personInfo 인스턴스 생성
        Map<String, Integer> personInfo = new HashMap<>();
        // personInfo에 앞에서 생성한 Person의 인스턴스에서 호출한 getName() 값 저장
        personInfo.put(people.get(0).getName(), 20);
        personInfo.put(people.get(1).getName(), 25);
        // StringBuilder를 이용한 문자열 합성 및 출력
        for (int i = 0; i < personInfo.size(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(people.get(i).getName()).append("의 나이는 ");
            sb.append(personInfo.get(people.get(i).getName())).append("살");
            String str = sb.toString();
            System.out.println(str);
        }
    }
}
