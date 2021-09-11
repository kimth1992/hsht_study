package taeho_study.Programers;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Programers_budget {

  public static void main(String[] args) {

    int[] d = {2,2,3,3};
    int result = 10;

    Solution20 sol = new Solution20();
    System.out.println(sol.solution(d, result));

  }

}


class Solution20 {
  public int solution(int[] d, int budget) {
    int sum = 0;
    int answer = 0;
    List<Integer> list = new LinkedList<>();

    for(int i = 0; i < d.length; i++) {
      list.add(d[i]);
    }
    Collections.sort(list);
    System.out.println(list);

    for(int i = 0; i < list.size(); i++) {
      sum += list.get(i);
      if(sum > budget) {
        sum = sum - list.get(i);
        answer = i;
        break;
      } else {
        answer = i+1;
      }
    }

    return answer;
  }
}