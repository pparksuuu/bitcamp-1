package step09;
// 인스턴스 메서드와 클래스 메서드 활용 - Math 클래스
public class Exam02_3 {
    public static void main(String[] args) throws Exception {
        // Math 클래스는 수학 관련 메서드를 모아둔 클래스이다.
        
        // => 절대값 계산
        System.out.println(Math.abs(-200));
        
        // => ceil() : 파라미터로 주어진 부동소수점이 바로 위 큰 정수 값을 리턴
        // => floor() : 파라미터로 주어니 부동소수점의 바로 밑 작은 정수 값을 리턴
        System.out.println(Math.ceil(3.28));
        System.out.println(Math.floor(3.28));
        System.out.println(Math.ceil(-3.28));
        System.out.println(Math.floor(-3.28));

        // => 2의 7승 값을 알고 싶을 때
        System.out.println(Math.pow(2, 7));
        
        // => 반올림하여 정수 값 리턴
        System.out.println(Math.round(3.14));
        System.out.println(Math.round(3.54));
    }
}
