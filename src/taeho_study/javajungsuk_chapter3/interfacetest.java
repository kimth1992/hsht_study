package taeho_study.javajungsuk_chapter3;

class A{

  void method(I i) {
    i.method();
  }

}

interface I{}

class B implements I{
  public void method(){
    System.out.println("B의 메서드 입니다.");
  }

}

class C implements I{
  public void method() {
    System.out.println("C의 메서드 입니다.");
  }
}


public class interfacetest {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    A a = new A();
    a.method(new C());


  }

}
