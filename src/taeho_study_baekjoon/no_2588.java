package taeho_study_baekjoon;

import java.util.Scanner;

public class no_2588 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    Scanner sc = new Scanner(System.in);
    int num1 = 0;
    int num2 = 0;
    int res1 = 0;
    int res2 = 0;
    int res3 = 0;
    int result = 0;

    num1 = sc.nextInt();
    num2 = sc.nextInt();


    res1 = num1 * ((num2%100)%10);
    res2 = num1 * ((num2%100)/10);
    res3 = num1 * ((num2/100));
    System.out.println(res1);
    System.out.println(res2);
    System.out.println(res3);


    result = num1 * num2;
    System.out.println(result);

  }

}
