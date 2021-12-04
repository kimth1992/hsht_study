package taeho_study.baekjoon;

import java.util.Arrays;

public class test {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    String[] arr = {"이", "문제가", "나를", "화나게", "한다."};
    String[] arr2 = new String[arr.length * 2];

    System.out.println(arr.length);
    System.out.println(arr2.length);

    arr2 = Arrays.copyOf(arr, arr.length);
    //  System.out.println(arr == arr2);
    System.out.println(arr2.length);
    System.out.println("ok");


    //  System.arraycopy(arr, 0, arr2, 0, arr.length);

    for(int i = 0 ; i < arr2.length ; i++) {
      System.out.print(arr2[i]);
    }
    System.out.println(arr == arr2);

  }

}
//System.arraycopy(cart, 0, cart2, 0, cart.length);
//cart2 = Arrays.copyOf(cart, cart.length);
//this.cart = cart2;