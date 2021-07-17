package taeho_study.javajungsuk_chapter6;

public class Prac6_19 {

  // 다음 코드의 실행 결과를 예측해보시게
  // 입력받은 str뒤에다가 문자열 456 붙이면 되는거 아닌가?
  // 너무 스무스한 문제인데??

  // 는 무슨.. ㅋㅋㅋㅋㅋㅋ
  // 참조값 개념 제대로 익혀라...



  public static void main(String[] args) {
    // TODO Auto-generated method stub

    String str = "ABC123";
    System.out.println(str);
    change(str);
    System.out.println("After change:"+str);

  }

  public static void change(String str) {
    str += "456";
  }

}
