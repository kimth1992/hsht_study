package hyungmin_study;

import java.util.Scanner;




public class No_9498 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    Scanner scn = new Scanner(System.in);
    int i = Integer.parseInt(scn.nextLine());
    if (90 <= i && i <= 100) {
      System.out.println("A");
    }else if (80 <= i && i <90) {
      System.out.println("B");
    }else if (70 <= i && i <80) {
      System.out.println("C");
    }else if (60 <= i && i <70) {
      System.out.println("D");
    }else if (i<60) {
      System.out.println("F");
    }
  }

}
