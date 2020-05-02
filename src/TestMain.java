import java.util.*;

public class TestMain {
    public static void main(String[] args) {
        ArrayList<Map<Integer, String>> selected = new ArrayList<>();

        ArrayList<String> strings = new ArrayList<>();
        strings.add("J");
        strings.add("a");
        strings.add("v");
        strings.add("a");

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "a");

        selected.add(map);

        strings.set(1, "");
        // keySet 구하기
        Set<Integer> ks = map.keySet();
        // keySet을 List로 변경하기
        List<Object> keyList = Arrays.asList(ks.toArray());
//        System.out.println(ks.toString());
    }
}
