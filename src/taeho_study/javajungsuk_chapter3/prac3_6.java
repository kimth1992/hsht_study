package taeho_study.javajungsuk_chapter3;

import java.util.Scanner;

// 변수 num의 값보다 크면서 가장 가까운 10의 배수에서 num의 값을 뺀 나머지를 구하는 코드

public class prac3_6 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    System.out.println("숫자를 입력해 주세요.");
    Scanner sc = new Scanner(System.in);
    int num = 0;
    num = sc.nextInt();
    System.out.println(num/10*10+10-num);
    System.out.println(10 - num%10);

  }

}
