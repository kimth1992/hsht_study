package taeho_study.Programers;

import java.util.LinkedList;
import java.util.List;

public class Programers_dislikeSameNumber {

  public static void main(String[] args) {

    int[] arr = {1,1,3,3,0,1,1};
    Solution29 sol = new Solution29();
    System.out.println(sol.solution(arr));


  }

}


class Solution29 {
  public List solution(int []arr) {
    int index = 0;

    List list = new LinkedList();
    for(int i = 0 ; i < arr.length; i++) {
      if(i < 1)
        list.add(arr[i]);
      else {
        if(!((int)list.get(index) == arr[i])) {
          list.add(arr[i]);
          index++;
        }
      }
    }

    return list;
  }
}