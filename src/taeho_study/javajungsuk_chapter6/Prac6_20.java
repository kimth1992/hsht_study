package taeho_study.javajungsuk_chapter6;

import java.util.Arrays;

public class Prac6_20 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    int[] original = {1,2,3,4,5,6,7,8,9};
    System.out.println(Arrays.toString(original));

    int[] result = shuffle(original);
    System.out.println(Arrays.toString(result));

  }



  static int[] shuffle(int[] arr) {


    for(int i = 0 ; i < arr.length ; i++) {

      int num = ((int)(Math.random() * arr.length));
      int temp = arr[i];
      arr[i] = arr[num];
      arr[num] = temp;
    }


    return arr;
  }



}
