package hyungmin_study;
import java.util.Scanner;
public class N0_2753 {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int i = Integer.parseInt(scn.nextLine());

    if (i%4 == 0 && i%100 != 0) {
      System.out.println(1);
    }else if (i%400 == 0) {
      System.out.println(1);
    }else {
      System.out.println(0);
    }

  }

}
