package taeho_study.Programers;

import java.util.LinkedList;
import java.util.List;

public class Programers_NoneNumberAdd {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    int[] numbers = {1,2,3,4,6,7,8,0};
    Solution30 sol = new Solution30();

    System.out.println(sol.solution(numbers));

  }

}


class Solution30 {
  public int solution(int[] numbers) {
    int answer = 0;

    List<Integer> list = new LinkedList<>();
    for(int i = 0; i< 10; i++) {
      list.add(i);
    }

    List<Integer> numbersList = new LinkedList<>();
    for(int i = 0; i < numbers.length; i++) {
      numbersList.add(numbers[i]);
    }

    list.removeAll(numbersList);
    for(int i = 0; i < list.size(); i++) {
      answer += list.get(i);
    }


    return answer;
  }
}