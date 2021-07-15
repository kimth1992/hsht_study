package taeho_study.javajungsuk_chapter4;

public class prac4_11 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    // 피보나치 수열

    //    int[] arr = new int[10];
    //    arr[0] = 1;
    //    arr[1] = 1;
    //
    //    for(int i =0 ; i < 8 ; i++) {
    //      arr[i+2] = arr[i+1] + arr[i];
    //
    //    }
    //    System.out.println(arr[9]);

    int num1 = 1;
    int num2 = 1;
    int num3 = 0;
    System.out.print(num1 + ","+num2);

    for(int i = 0 ; i < 8 ; i++) {

      num3 = num1 + num2;
      System.out.print(","+num3);

      num1 = num2;
      num2 = num3;

    }

  }

}
// 배열로 하는게 훨씬 깔끔한 코드인듯.