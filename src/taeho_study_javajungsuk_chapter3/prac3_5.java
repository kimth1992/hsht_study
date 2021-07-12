package taeho_study_javajungsuk_chapter3;

import java.util.Scanner;

// num의 값 중 1의 자리를 1로 바꾸는 코드
// num이 333이라면 331, 777이라면 771


public class prac3_5 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    System.out.println("숫자를 입력해 주세요.");
    Scanner sc = new Scanner(System.in);
    int num = 0;
    num = sc.nextInt();
    System.out.println(num/10*10+1);


  }

}
