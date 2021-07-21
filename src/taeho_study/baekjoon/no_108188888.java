package taeho_study.baekjoon;

import java.util.Scanner;

public class jihyeon {

  static boolean checkN(int N) {
    if (1_000_000<N || N <1) {
      System.out.println("N값이 범위를 벗어났습니다");
      return false;
    } return true;
  }

  static boolean checkInput(int N) {
    if (1_000_000<N || N < -1_000_000) {
      System.out.println("입력값이 범위를 벗어났습니다");
      return false;
    } return true;
  }




  public static void main(String[] args) {


    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    if (!checkN(N)) {
      return;
    }
    int[] arr = new int[N];
    int min = 1000000;
    int max = -1000000;


    for(int i = 0 ; i < N ; i++) {
      arr[i] = sc.nextInt();
      if (!checkInput(arr[i])) {
        return;
      }

      if(arr[i] < min) {
        min = arr[i];

      }

      if(arr[i]>max) {
        max = arr[i];
      }

    }

    System.out.printf("%d %d",min, max );

  }

}
