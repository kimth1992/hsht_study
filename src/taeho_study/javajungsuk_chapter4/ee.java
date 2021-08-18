package taeho_study.javajungsuk_chapter4;

public class ee {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    ee e = new ee();
    System.out.println(e.add2());

  }

  int add2() {

    int a = 3;
    int b = 5;
    int result = add(a,b);

    return result;

  }

  int add(int a, int b) {
    return a+b;
  }

}
