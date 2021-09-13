package taeho_study.Programers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TT {

  public static void main(String[] args) {

    int a = 21;
    int b = 6;

    System.out.println(solution(a,b));

  }


  static int solution(int a, int b) {

    Set set = new HashSet();
    int big = 0;
    int small = 0;
    int count = 0;

    if(a > b) {
      big = a;
      small =b;
    } else {
      big = b;
      small = a;
    }
    // 21 , 6 
    List<Integer> list = new ArrayList<>();

    for (int i = small ; i> 0; i--) {
      if((big % i == 0) && (small % i == 0)) {
        list.add(i);
      }

    }

    System.out.println(list);

    Collections.sort(list);

    return list.get(list.size()-1);

  }

}





