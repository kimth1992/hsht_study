package taeho_study_javajungsuk_chapter3;

import java.util.Scanner;

public class prac3_9 {

  // 변수 ch가 영문자 이거나 숫자일대만 변수 b의 값이 true가 되는 코드

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    // System.out.println("문자를 입력해 주세요.");
    // Scanner sc = new Scanner(System.in);   
    // String ch = "null";
    // ch = sc.nextLine();

    String str;
    System.out.println("문자를 입력해 주세요.");
    Scanner sc = new Scanner(System.in);
    str = sc.nextLine();

    int number = Integer.pa


        char ch;
    ch = str.charAt(0);

    //char ch = '$';
    boolean b = ('a' <= ch && ch <='z' || 'A' <= ch && ch <= 'Z' || '0'<= ch && ch<='9');
    System.out.println(b);

  }

}
