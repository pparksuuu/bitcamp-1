// 변수의 범위 - 변수의 중복
package step02;

public class Exam11_3 {
    int a;
    static int b;
    // 클래스 블록 안에 선언된 변수는 종류에 상관없이 중복 선언 불가!
    int a;
    public static void main(String[] args) {
        int c;
        int b = 20;
        
        // 그러나 static 붙지 않은 인스터ㅓㄴ스 변수는 사용할 수 없다.
        // a = 100; 컴파일 오류!

        // 마찬가지로 이 블록 안에서는 같은 이름의 변수를 만들 수 없다.
        String a; // 컴파일 오류
    }
    public static void m2() {
        // static 이 붙은 블록(스태틱 메서드 = 클래스 메스드)에서는 
        // 그 블록 바깥 쪽에 있는 스태틱 변수)를 사용할 수 있다.
        b = 20;
        // a = 100; 컴파일 오류!
    }
    public void m3() {
        // static이 붙지 않은 블록(인스턴스 블록)에서는
        // 그 블록 바깥 쪽에 선언된 변수를 모두 접근할 수 있다.
        b = 20;
        a = 100;
    }
    public void m4() {
        b = 20;
        a = 100;

    }
}
