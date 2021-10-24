package taeho_study;

import java.util.ArrayList;
import java.util.List;

public class tt {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    List<String> list = new ArrayList<>();
    list.add("하이");
    list.add("ok");
    list.add("kkkkk");
    list.add("last");
    System.out.println("size = " + list.size());

    for (int i = list.size() - 1; i >= 0; i--) {
      System.out.printf("사이즈는 %d, 첫번째 i는 %d\n",list.size(),i);
      list.remove(i);
      System.out.println();
      break;
    }

    System.out.println(list);

  }

}
