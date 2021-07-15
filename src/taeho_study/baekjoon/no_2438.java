package taeho_study.baekjoon;

import java.util.Scanner;

public class no_2438 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    Scanner sc = new Scanner(System.in);
    int N = 0;
    N = sc.nextInt();

    for(int i = 0; i < N; i++) {
      for(int j = 0; j <i; j++) {
        System.out.print("*");
      }
      System.out.println("*");
    }

  }

}
