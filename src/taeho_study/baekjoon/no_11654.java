package taeho_study.baekjoon;

import java.util.Scanner;

//알파벳 소문자, 대문자, 숫자 0-9중 하나가 주어졌을 때, 
//주어진 글자의 아스키 코드값을 출력하는 프로그램을 작성하시오.

public class no_11654 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();

    char c = str.charAt(0);
    System.out.println((byte)c);

  }

}
