package taeho_study.javajungsuk_chapter7_season2;

abstract class Shape{
  Point p;

  Shape(){
    this(new Point(0,0));
  }

  Shape(Point p){
    this.p = p;
  }

  abstract double calcArea();

  Point getPosition() {
    return p;
  }

  void setPosition(Point p) {
    this.p = p;
  }
}

class Point {
  int x;
  int y;

  Point(){
    this(0,0);
  }

  Point(int x, int y){
    this.x = x;
    this.y = y;
  }
  public String toString() {
    return "{"+x+","+y+"]";
  }
}

class Circle extends Shape{
  double r;

  double calcArea() {

    return 0;
  }
}


class Rectangle extends Shape{
  double width;
  double height;

  double calcArea() {

    return 0;
  }
}


public class prac2_7_22 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

  }

}
