package taeho_study.javajungsuk_chapter4;

public class TT {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    int num = 0;
    int sum = 0; 

    while(num <= 20) {
      if(num / 2 ==0) {
        //continue;

      } else if(num / 2 ==1) {
        sum = sum + num;
      }

      num++;
    }

    System.out.println(sum);

  }

}
