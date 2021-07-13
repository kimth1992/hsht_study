package taeho_study_javajungsuk_chapter4;

public class prac4_6 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    //두 개의 주사위를 던져 합이 6이 되는 모든 경우의 수를 구하여라

    for(int i = 1; i <= 6; i++) {
      for(int j = 1; j <= 6 ; j++) {
        if(i + j == 6)
          System.out.printf("%d , %d\n", i , j);
      }


    }

  }

}
