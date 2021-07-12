package taeho_study_javajungsuk_chapter3;

public class prac3_8 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    byte a = 10;
    byte b = 20;
    byte c = a  + b; // byte의 크기는 1byte인데 덧셈 연사자를 할때는 명시적 형변환으로 int로 전환됨
    // 그래서 int c로 변경해 줘야 할 

    char ch = 'A';
    ch = ch +2;     // char 역시 동일한 이유 int 변수를 만들어 집어 넣거나
    // 형변환으로 ch+2 앞에 char 붙여주기

    float f = 3 /2;         // 저장하는 변수는 float이지만 연산 진행되는 값은 int 이므로 1.0 저장
    // 3이나 2앞에 float 붙여주면 해결될듯
    long l = 3000 * 3000 * 3000;        // 얘도 l으로 받아야 하니 3000 3개중에 1개에 l 붙여주

    float f2 = 0.1f;
    double d = 0.1;

    boolean result = d == f2;       // 이건 무슨 해괴한 식이지..?
    // d앞에 float붙여주면 될듯?


    System.out.println("c ="+c);
    System.out.println("ch = "+ch);
    System.out.println("f = "+f);
    System.out.println("l = "+l);
    System.out.println("result =" +result);



  }

}
