package hyeyeon_study;

import java.util.Scanner;
public class no_2753 {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int A = scan.nextInt();

    if (A%4==0 && !(A%100==0) || A%400==0){
      System.out.println("1");
    } else {
      System.out.println("0");
    }
  }
}