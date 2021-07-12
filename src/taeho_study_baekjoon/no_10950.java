package taeho_study_baekjoon;

import java.util.Scanner;

public class no_10950 {

  public static void main(String[] args) {

    int a = 0;
    int b = 0;
    int num = 0;
    Scanner sc = new Scanner(System.in);
    num = sc.nextInt();

    for(int i = 0; i < num ; i++) {
      a = sc.nextInt();
      b= sc.nextInt();
      System.out.println(a+b);
    }

  }

}