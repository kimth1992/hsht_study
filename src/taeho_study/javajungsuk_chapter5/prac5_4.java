package taeho_study.javajungsuk_chapter5;

public class prac5_4 {

  public static void main(String[] args) {
    // 2차원 배열 arr에 담긴 모든 값의 총합과 평균을 구하는 프로그램

    int[][] arr = {
        {5,5,5,5,5},        //[0,0] ~ [0,4]
        {10,10,10,10,10},
        {20,20,20,20,20},
        {30,30,30,30,30}
    };

    int total = 0;
    float average = 0;

    for(int i = 0 ; i < arr.length ; i++) {
      for(int j = 0; j < arr[0].length; j++){
        total += arr[i][j];
      }
    }

    average = (float)total / ((arr.length) * (arr[0].length));



    System.out.println("total = " + total);
    System.out.println("average = "+ average);



  }

}
