package hyungmin_study;
import java.util.Scanner;
public class No_2884 {
  //정답아님  런타임 오류 
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int h = Integer.parseInt(scn.nextLine());
    int m = Integer.parseInt(scn.nextLine());
    if (m>=45) {
      System.out.print(h + " ");
      System.out.println(m-45);
    }else { 
      if(h==0) {
        System.out.print(23 + " ");
        System.out.println(m+15);
      }else 
        System.out.print(h-1 + " ");
      System.out.println(m+15);
    }
  }
}
