package taeho_study.javajungsuk_chapter4;

import java.util.Scanner;

public class prac4_14 {

  // 1~100 사이 값을 반복적으로 입력해서 컴터가 정한 숫자 맞추기
  public static void main(String[] args) {
    // TODO Auto-generated method stub

    int answer = (int)(Math.random() * 100 + 1);
    int input = 0;  // 사용자입력 저장 공간
    int count = 0;  // 시도횟수

    Scanner sc = new Scanner(System.in);

    do {

      count++;
      System.out.print("1~100 사이 값을 입력하세요 : ");
      input = sc.nextInt();

      if(input < answer) {
        System.out.println("더 큰 수를 입력하세요. ");
      } else if(input > answer) {
        System.out.println("더 작은 수를 입력하세요. ");
      } else {
        System.out.println("맞췄습니다.");
        System.out.println("시도횟수는 " + count +"번입니다.");
        break;
      }

    }while(true);

  }

}
