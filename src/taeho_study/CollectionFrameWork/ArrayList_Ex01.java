package taeho_study.CollectionFrameWork;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_Ex01 {

  public static void main(String[] args) {

    ArrayList list1 = new ArrayList(10); // 생성자가 파라미터로 배열 수를 받는 것도 있음. 없을시 크기 10
    list1.add(new Integer(5));
    list1.add(new Integer(4));
    list1.add(new Integer(2));
    list1.add((0));
    list1.add((1));
    list1.add((3));

    ArrayList list2 = new ArrayList(list1.subList(1, 4));
    System.out.println(list1);
    System.out.println(list2);
    System.out.println("list2의 크기 : " +list2.size());
    System.out.println("------------------------");

    Collections.sort(list1);
    Collections.sort(list2);

    System.out.printf("%s\n%s\n", list1, list2);
    System.out.println("------------------------");

    System.out.println("list1.containsAll(list2):" + list1.containsAll(list2));

    list2.add("B");
    list2.add("C");
    list2.add(3, "A");

    System.out.println(list1);
    System.out.println(list2);

    System.out.println("------------------------");

    list2.set(3, "AA");
    System.out.println(list1);
    System.out.println(list2);

    System.out.println("------------------------");

    System.out.println("list1.retainAll(list2):"+ list1.retainAll(list2)); // 겹치는것 남기고 삭제

    System.out.println(list1);
    System.out.println(list2);
    System.out.println("list2의 크기 : " +list2.size());
    System.out.println("------------------------");

    for(int i = list2.size() -1; i >= 0; i --) {
      if(list1.contains(list2.get(i)))
        list2.remove(i);
    }


    //    for(int i = 0 ; i < list2.size() ; i++) {
    //      if(list1.contains(list2.get(i)))
    //        list2.remove(i);
    //    }

    System.out.println(list1);
    System.out.println(list2);

  }

}
