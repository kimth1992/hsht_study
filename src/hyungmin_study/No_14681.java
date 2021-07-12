package hyungmin_study;
import java.util.Scanner;
public class No_14681 {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int x = Integer.parseInt(scn.nextLine());
    int y = Integer.parseInt(scn.nextLine());

    if (x>0 && y>0) {
      System.out.println(1);
    }else if (x<0 && y>0) {
      System.out.println(2);
    }else if (x<0 && y<0) {
      System.out.println(3);
    }else if (x>0 && y<0) {
      System.out.println(4);
    }



  }

}
