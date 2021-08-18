package taeho_study.baekjoon;

import java.util.Scanner;

public class no_1152 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine().trim();

    if (input.length() == 0) {  
      System.out.println(0);
    } 
    else {
      String s[] = input.split(" ");
      System.out.println(s.length);
    }

  }

}

//    Scanner scn = new Scanner(System.in);
//    String[] s = scn.nextLine().strip().split(" ");
//    if(s.equals("")) {
//      System.out.println("0");
//    }
//    //System.out.println(Arrays.toString(s));
//    else {
//      System.out.println(s.length);
//    }


//    Scanner scn = new Scanner(System.in);
//    String[] s = scn.nextLine().trim().split(" ");
//    Arrays.toString(s);
//    System.out.println(s.length);