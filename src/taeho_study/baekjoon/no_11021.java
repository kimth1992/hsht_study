package taeho_study.baekjoon;

import java.util.Scanner;

public class no_11021{
  public static void main(String[] args){


    int a =0;
    int b= 0;
    Scanner sc = new Scanner(System.in);
    int num = 0;
    num = sc.nextInt();

    for(int i = 0; i<num; i++) {
      a = sc.nextInt();
      b = sc.nextInt();
      System.out.printf("Case #%d: %d\n", i+1, a+b);
    }

  }

}