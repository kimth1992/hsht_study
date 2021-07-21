package taeho_study.baekjoon;
import java.util.Scanner;

public class kk {
  static int[] arr;
  public static void main(String[] args) {
    // TODO Auto-generated method stub
    // N개의 정수에서 최솟값과 최댓값 구하기
    // 1<=N<=1_000_000
    // -1_000_000 <= 입력 <= 1_000_000
    Scanner scn = new Scanner(System.in);
    int N = 0;
    int i = 0;
    while(i<2) {
      if (i==0) {
        N = scn.nextInt();
        // N 유효값 체크
        if (!checkN(N)) {
          return;
        }
        arr = new int[N];
        i++;
      } else {
        for (int j=0;j<N;j++) {
          arr[j] = scn.nextInt();
          // input 유효값 체크
          if (!checkInput(arr[j])) {
            return;
          }
          i++;
        }
      }
    } 

    int[] newArr = arrMinMax(arr);
    //System.out.println(Arrays.toString(newArr));
    System.out.printf("%d %d",newArr[0],newArr[N-1]);
  }

  static int[] arrMinMax(int[] arr) {
    for (int i=0;i<arr.length;i++) {
      for (int j=i+1;j<arr.length;j++) {
        if (arr[i]>arr[j]) {
          int tmp = arr[i];
          arr[i] = arr[j];
          arr[j]= tmp;
        }
      }
    } 
    return arr;
  }
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
}