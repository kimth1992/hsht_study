package taeho_study.Programers;

import java.util.ArrayList;
import java.util.List;

public class juri {

  public static void main(String[] args) {
    // TODO Auto-generated method stub


    List<Integer> list = new ArrayList<>();


    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);


    for(int i = list.size()-1; i >= 0; i--) {
      list.remove(i);
    }

    System.out.println(list);


  }

}
