package taeho_study.javajungsuk_chapter6;

public class Prac6_5 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    Student s = new Student("홍길동", 1,1,100,60,76);

    System.out.println(s.info());
  }

}

class Student {
  String name;
  int ban;
  int no;
  int kor;
  int eng;
  int math;

  Student(String name, int ban, int no, int kor, int eng, int math) {
    this.name = name;
    this.ban = ban;
    this.no = no;
    this.kor = kor;
    this.eng = eng;
    this.math = math;
  }

  String info() {

    return name + "," + ban + "," + no + "," + kor + "," + eng + "," + math + "," + getTotal() + 
        "," + getAverage();
  }

  int getTotal() {

    return kor + eng + math;
  }


  float getAverage() {

    return (int)(getTotal() / 3f *10 + 0.5f) / 10f;
  }

}