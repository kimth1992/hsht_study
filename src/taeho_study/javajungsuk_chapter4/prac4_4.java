package taeho_study.javajungsuk_chapter4;

public class prac4_4 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub


    int sum = 0;
    int i = 0;
    for(i = 1 ; i < 200; i++) {
      if(i%2 != 0) {
        sum += i;
      }
      else {
        i = -i;
        sum += i;
        i = -i;
      }


      if(sum >=100)
        break;
    }
    System.out.printf("i = %d, sum = %d", i, sum);


  }

}

// 만들고 보니 매우 지저분한 코드..
// 부호변수를 하나 만들어서 -1을 곱하면서 사용하는게 더 깔끔했을 듯..

