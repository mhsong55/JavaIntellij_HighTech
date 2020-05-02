package Chapter14;

public class Ex5 {
    static class Empty {    // extends Object 가 생략 됨

    }

    public static void main(String[] args) {
        Empty e = new Empty();
        String s = e.toString();
        System.out.println(s);  // s.toString() 이 호출 됨
    }
}
