package taeho_study.baekjoon;

import java.util.Scanner;

public class no_10818 {

  public static void main(String[] args) {


    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] arr = new int[N];
    int min = 1000000;
    int max = -1000000;


    for(int i = 0 ; i < N ; i++) {
      arr[i] = sc.nextInt();

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
