package taeho_study_baekjoon;

import java.util.Scanner;

public class no_10952 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);

    int a = 0;
    int b = 0;

    while(true) {

      a= sc.nextInt();
      b= sc.nextInt();

      if(a == 0 && b == 0)
        break;


      System.out.println(a+b);
    }


  }

}
