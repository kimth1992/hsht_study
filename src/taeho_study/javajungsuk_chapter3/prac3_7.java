package taeho_study.javajungsuk_chapter3;

import java.util.Scanner;

public class prac3_7 {

  //화씨(F)를 섭씨(C)로 변환하는 코드
  // C = 5/9 * (F -32)
  // 결과값은 소수점 셋째자리에서 반올림

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    System.out.println("화씨온도를 입력해 주세요.");
    Scanner sc = new Scanner(System.in);
    int f = 0;
    f = sc.nextInt();

    float c = (float)5/(float) 9 * (f-32);

    System.out.println("f : " + f);
    System.out.printf("c : %.2f" , c);




  }

}
