package hyungmin_study;

import java.util.Scanner;

public class No_2739 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();

    for(int i = 1; i < 10; i++) {
      System.out.printf("%d %s %d %s %d\n",N,"*",i,"=",N*i);
    }


  }

}
