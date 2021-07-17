package taeho_study.javajungsuk_chapter6;

public class Prac6_13 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    //add 메서드를 올바르게 오버로딩 한 것은? (얘도 모두 고르래..)

    long add(int a, int b) {
      return a + b;
    }

    a. long add(int x, int y) {
      return a+b;
    }
    // 변한게 없음. 파라미터? 매개변수? 이름은 전혀 상관이 없음. 한글도 가능함. 세종대왕님 만세

    b. long add(long a, long b) {
      return a+b;
    }

    // 아주 올바름. 매개변수 타입이 다름.

    c. int add(byte a, byte b) {
      return a + b;
    }

    // b와 같은 이유로 아주 올바른 친구임

    d. int add(long a, int b) {
      return (int)(a+b);
    }

    // 얘도 괜찮을 듯. 매개변수 타입이 다름.




    System.out.println("hello");


  }

}
