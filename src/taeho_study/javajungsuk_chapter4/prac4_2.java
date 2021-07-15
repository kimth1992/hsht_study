package taeho_study.javajungsuk_chapter4;

public class prac4_2 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    // 1부터 20까지 정수 중에서 2 또는 3의 배수가 아닌 수의 총합
    int sum = 0;

    for(int i = 0 ; i < 20; i++) {

      if((i %2 !=0) && (i%3 !=0)) {
        System.out.print(i+", ");
        sum += i;
      }

    }
    System.out.println();

    System.out.println(sum);

  }

}
