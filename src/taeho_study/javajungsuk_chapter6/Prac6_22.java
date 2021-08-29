package taeho_study.javajungsuk_chapter6;

public class Prac6_22 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    String str = "123";
    System.out.println(str+"는 숫자입니까? "+isNumber(str));

    str = "12e3434";
    System.out.println(str+"는 숫자입니까? "+isNumber(str));
  }



  static boolean isNumber(String str) {

    if(str == null || str == "")
      return false;


    for(int i = 0 ; i <str.length() ; i++) {
      char ch = str.charAt(i);

      //      if('0' <= ch && ch <= '9')
      //        return true;

      if(ch < '0' || ch > '9' )
        return false;
    }

    return true;
  }
}


