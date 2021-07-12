package taeho_study_javajungsuk_chapter3;

import java.util.Scanner;


// num 값에 따라 양수, 0, 음수를 출력하는 프로그램

public class prac3_3 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    Scanner sc = new Scanner(System.in);
    int num = 0;
    System.out.println("숫자를 입력해 주세요.");
    num = sc.nextInt();

    System.out.println(num > 0 ? "양수" : (num < 0 ? "음수" : "0"));

  }

}
