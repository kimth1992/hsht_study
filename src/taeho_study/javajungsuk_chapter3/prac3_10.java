package taeho_study.javajungsuk_chapter3;

public class prac3_10 {

  // 대문자를 소문자로 바꾸는 코드
  // 문자코드는 소문자가 대문자보다 32만큼 더 크다
  // 'A' 코드는 65, 'a' 코드는 97


  public static void main(String[] args) {
    // TODO Auto-generated method stub

    char ch = 'F';

    char lowerCase = (char) ((65 <= ch && ch <= 96) ? ch +32 : ch);

    System.out.println("ch = "+ch);
    System.out.println("ch to lowerCase : "+lowerCase);

  }

}
