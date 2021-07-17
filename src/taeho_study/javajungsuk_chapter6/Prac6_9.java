package taeho_study.javajungsuk_chapter6;

public class Prac6_9 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    System.out.println("hello");

  }

}

class Marine{
  int x = 0, y = 0; // 위치좌표(x,y)
  int hp = 60;
  int weapon = 6;
  int armor = 0;

  void weaponUp() {
    weapon++;
  }

  void armorUp() {
    armor++;
  }

  void move(int x, int y) {
    this.x = x;
    this.y = y;
  }


}

// 격력과 방어력이 모두 같아야 하므로 weapon, armor에 static 붙여주면 되지 않을까 싶다.
// 물론 메서드도 weaponUp과 armorUp에 static!

