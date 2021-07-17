package taeho_study.javajungsuk_chapter6;

// 다음 코드를 컴파일 하면 에러가 난대. 에러 발생 라인과 이유를 설명하래.
// 아 이건 코드 쓰면 답이 보이니 먼저 풀고 한다.


public class Prac6_18 {

}


class MemberCall{
  int iv = 10;
  static int cv = 20;

  int iv2 = cv;
  static int cv2 = iv;  

  static void staticMethod1() {
    System.out.println(cv);
    System.out.println(iv);
  }

  void instanceMethod1() {
    System.out.println(cv);
    System.out.println(iv);
  }

  static void staticMethod2() {
    staticMethod1();
    instanceMethod1();
  }

  void instanceMethod2() {
    staticMethod1();
    instanceMethod1();
  }


}