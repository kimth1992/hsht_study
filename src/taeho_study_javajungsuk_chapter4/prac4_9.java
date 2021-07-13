package taeho_study_javajungsuk_chapter4;

public class prac4_9 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    // 숫자로 이루어진 문자열 str을 각 자리의 합을 더한 결과를 출력하는 코드
    // ex) 12345라면 1+2+3+4+5의 결과 15를 출력

    String str = "12345";
    int sum = 0;

    for(int i = 0; i < str.length(); i++) {

      sum += str.charAt(i) - '0';


    }

    System.out.println(sum);

  }

}
