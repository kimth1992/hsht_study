package taeho_study.javajungsuk_chapter6;

public class Prac6_16 {


  문제가 너무 많다..

  다음 중 지역변수에 대한 설명으로 옳지 않은것은? (모두 고르기)

      a. 자동 초기화되므로 별도의 초기화가 필요 없다.

      // 거짓말 노놉 위 설명은 인스턴스 변수

      b. 지역변수가 선언된 메서드가 종료되면 지역변수도 함께 소멸된다.

      //  call statck(JVM Stack) 에서 메서드가 사라지니 당연히 지역변수도 같이 소멸

      c. 메서드의 매개변수로 선언되 변수도 지역변수이다.

      // 당연한 말씀

      d. 클래스변수나 인스턴스변수보다 메모리 부담이 적다.

      // 쓰고 사라지니까 메모리 적게 먹지 않을까??

      e. 힙(heap)영역에 생성되며 가비지 컬렉터에 의해 소멸된다.

      // 이건 인스턴스 변수 설명. 로컬변수는 Call stack에 생성됨

      답은 a랑 e !!
      완벽!




}
