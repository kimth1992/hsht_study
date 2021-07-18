package hyungmin_study;

import java.util.Random;
import java.util.Scanner;
// 틀린 문제입니다! 결과는 문제랑 얼추 맞게 나오지만 원인을 모르겠습니다.

public class No_1087_1 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    int x = scanner.nextInt();
    Random rand = new Random();
    int[] A = new int[N];

    for (int i = 0; i < N; i++) {
      A[i] = rand.nextInt(N);
    }

    for(int i = 0; i < A.length; i++ ) {
      if (A[i] > x) {
        System.out.print(A[i]+",");
      }
    }

  }
}


