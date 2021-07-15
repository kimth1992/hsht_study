package taeho_study.baekjoon;

import java.util.Scanner;

public class no_10871 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    Scanner sc = new Scanner(System.in);
    int N =0;
    int X =0;
    int A = 0;
    N = sc.nextInt();
    X = sc.nextInt();

    for(int i = 0; i < N; i++) {

      A = sc.nextInt();

      if(A < X) {
        System.out.print(A+" ");
      }
    }





  }

}
