package taeho_study.javajungsuk_chapter6;

public class Prac6_17 {

  호출스택이 다음과 같은 상황일 때 옳지 않은 것은? (모두 고르기)

      상황이 대충 스택이 쌓여있는데 순서가

      println
      method1
      method2
      main          순서임

      a. 제일 먼저 호출스택에 저장된 것은 main메서드 이다.
      // 당연한 말씀

      b. println메서드를 제외한 나머지 메서드들은 모두 종료된 상태이다.
      // 종료된게 아니라 대기상태! 종료되면 스택에서 사라진다.

      c. method2메서드를 호출한 것은 main 메서드 이다.
      // 당연한 말씀

      d. println메서드가 종료되면 method1메서드가 수행을 재게한다.
      // 옳으신 말씀

      e. main-method2-method1-println의 순서로 호출되었다.
      // 지당하신 말씀

      f. 현재 실행중인 메서드는 println뿐이다.
      // 그렇지. 나머지는 대기중이지

      답은 b 하나?

}
