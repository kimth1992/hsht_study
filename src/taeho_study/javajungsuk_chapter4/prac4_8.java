package taeho_study.javajungsuk_chapter4;

public class prac4_8 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    // 방정식 2x + 4y = 10의 모든 해를 구하시오. (0 <= x <= 10 , 0 <= y <= 10)

    for(int x = 0; x < 10; x++) {
      for(int y = 0; y < 10; y++) {
        if(2 * x + 4 * y == 10) {
          System.out.printf("x=%d, y=%d\n", x, y);
        }
      }
    }

  }

}
