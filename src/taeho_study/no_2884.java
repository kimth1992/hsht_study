package taeho_study;

import java.util.Scanner;

public class no_2884{
  public static void main(String[] args){


    Scanner sc = new Scanner(System.in);
    int hour = 0;
    int min = 0;

    hour = sc.nextInt();
    min = sc.nextInt();


    if(hour == 0) {
      if(min >= 45) {
        min -= 45;
      }
      else {
        hour = 23;
        min = min + 60 - 45;
      }
    }

    else {
      if(min >= 45) {
        min -= 45;
      }
      else {
        hour -= 1;
        min = min +60 -45;
      }
    }

    System.out.printf("%d %d", hour,min);
    sc.close();

  }

}
