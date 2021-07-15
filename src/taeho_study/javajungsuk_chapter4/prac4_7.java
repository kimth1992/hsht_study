package taeho_study.javajungsuk_chapter4;

public class prac4_7 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    // Math.random()을 이용해서 1~6 사이의 임의의 정수를 변수 value에 저장하는 코드

    int value = (int)(Math.random() * 6) + 1;

    System.out.println(value);
  }

}
