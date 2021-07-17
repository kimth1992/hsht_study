package taeho_study.javajungsuk_chapter6;

public class Prac6_8 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    PlayingCard card = new PlayingCard(1,1);
  }

}

class PlayingCard{
  int kind;
  int num;

  static int width;
  static int height;

  PlayingCard(int k, int n){
    kind = k;
    num = n;
  }
}

// 클래스 변수(static 변수) : width, height
// 인스턴스 변수 : kind, num
// 지역 변수 : k, n, card, args
