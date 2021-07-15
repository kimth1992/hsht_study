package taeho_study.javajungsuk_chapter4;

public class prac4_10 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    // int타입의 변수 num이 있을 때, 각 자리의 합을 더한 코드
    // num이 12345 이면 15

    int num = 12345;
    int sum = 0;

    for(int i = 0; ; i++) {

      sum += num %10;
      num /= 10;

      if(num ==0)
        break;

    }
    //    while(num > 0) {
    //
    //      sum += num % 10;
    //      num /= 10;
    //
    //    }
    System.out.println(sum);

  }

}

// for문 while문 둘다 가능
