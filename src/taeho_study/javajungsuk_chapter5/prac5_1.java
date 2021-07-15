package taeho_study.javajungsuk_chapter5;

public class prac5_1 {

  // 배열선언 및 초기화. 잘못된 것 고르기

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    int arr[] = new int[] {1,2,3,4,5};


    a. int[] arr[];                         // 뭔가 근본없어 보이는데 선언만 하면 이정도도 될것 같음

    b. int[] arr = {1,2,3};                 // 근본

    c. int[] arr = new int[5];              // 제일 근본

    d. int[] arr = new int[5] {1,2,3,4,5};  // 위가 제일 근본인줄 알았는데 얘가 세상 제일 근본
    // 반전.. 이렇게 쓸때는 대괄호 안에 숫자 쓰면 안됨.
    // new int[]{1,2,3,4,5}가 맞다고 함.

    e. int arr[5];                          // 5개 만드려면 new int로 객체 생성해야하지 않나?

    f. int[] arr[] = new int[3][];          // 2차원 배열 이렇게 쓰는거 봤던 것 같음.



  }

}
