package taeho_study_javajungsuk_chapter4;

public class prac4_5 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    // 주어진 for문을 while문으로 변경하기

    //  for(int i = 0; i <= 10; i++) {
    //  for(int j = 0; j<=i ; j++) 
    //    System.out.print("*");
    //  System.out.println();
    //
    //}



    int i = 0;
    int j  = 0;
    while(i <= 10) {

      while(j <= i) {
        System.out.print("*");
        j++;
      }

      j =0;
      System.out.println();
      i++;
    }

  }

}

// 이것도 j = 0 을 첫 while문 안에다가 넣으면 쉬운것을 굳이 밖으로 빼서 j = 0 을 재설정 하게 만듬..
// 현재 효율적으로 짜는 능력이 제로임..
