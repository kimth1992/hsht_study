package taeho_study_javajungsuk_chapter3;

import java.util.Scanner;

// num값 중에 백의 자리 이하를 버리는 코드


public class prac3_4 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    System.out.println("숫자를 입력해 주세요.");
    Scanner sc = new Scanner(System.in);
    int num = 0;
    num = sc.nextInt();

    System.out.println(num/100*100);



  }

}
