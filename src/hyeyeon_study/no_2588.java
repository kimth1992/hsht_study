package hyeyeon_study;

import java.util.Scanner;
public class no_2588 {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int A = scan.nextInt();
    int B = scan.nextInt();

    System.out.println(A*(B%10));
    System.out.println(A*(B%100/10));
    System.out.println(A*(B/100));
    System.out.println(A*B);

  }

}
