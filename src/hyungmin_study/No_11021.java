package hyungmin_study;

import java.util.Scanner;

public class No_11021 {

  public static void main(String[] args) {
    Scanner sca = new Scanner(System.in);
    int T = sca.nextInt();

    int sum;

    if (T!=0) {
      for(int i = 1; i <= T; i++) {
        int a = sca.nextInt();
        int b = sca.nextInt();
        sum = a + b;
        System.out.printf("Case #%d: %d",i,sum);
      }
    }











  }

}
