package taeho_study.javajungsuk_chapter6;

public class Prac6_24 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    int value = 5;
    System.out.println(value+"의 절대값:"+abs(value));
    value = -10;
    System.out.println(value+"의 절대값:"+abs(value));

  }

  static int abs(int value) {

    value = Math.abs(value);

    return value;
  }

}
