package taeho_study.javajungsuk_chapter7;

public class Prac7_17 {

}

abstract class Unit{
  int x, y;
  abstract void move(int x, int y);
  void stop() {}

}

class Marine extends Unit{

  void move(int x, int y) {

  }
  void stimPack() {

  }

}

class Tank extends Unit{

  void move(int x, int y) {}
  void changeMode() {

  }
}

class Dropship extends Unit{

  void move(int x, int y) {}
  void load() {}
  void unload() {}
}
