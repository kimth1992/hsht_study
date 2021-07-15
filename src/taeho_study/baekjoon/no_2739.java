package taeho_study.baekjoon;

import java.util.Scanner;
public class no_2739{
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    int num = 0;
    num = sc.nextInt();

    for(int i = 0; i<9; i++){
      System.out.printf("%d * %d = %d\n", num, i+1, num*(i+1) );
    }
  }
}