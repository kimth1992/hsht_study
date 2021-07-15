package taeho_study_javajungsuk_chapter4;

public class prac4_15 {

  // 회문수 구하기
  // 회문수란? 숫자를 거꾸로 읽어도 앞으로 읽는 것과 같은 수
  // ex) 12321    ,   13531

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    int number = 12321;
    int tmp = number;

    int result = 0; // number를 거꾸로 담을 변수

    while(tmp !=0) {


      result = result * 10 + tmp %10;
      tmp /= 10;




    }
    // result = 10

    if(number == result)
      System.out.println(number + "는 회문수 입니다.");
    else
      System.out.println(number + "는 회문수가 아닙니다.");


  }

}
