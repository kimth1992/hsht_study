package taeho_study.Programers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

public class Programers_2arr_add {
  public static void main(String[] args) {

    int[] numbers = {5,0,2,7};

    Solution19 sol = new Solution19();
    System.out.println(sol.solution(numbers));

  }
}


//class Solution19 {
//  public int[] solution(int[] numbers) {
//    Set<Integer> list = new TreeSet<>();
//
//    for (int i = 0; i < numbers.length; i ++) {
//      for (int j = i+1; j < numbers.length; j++) {
//        int num = numbers[i] + numbers[j];
//        list.add(num);
//      }
//    }
//
//    System.out.println(list.size());
//    
//    Iterator<Integer> iterator = list.iterator();
//
//
//    int[] answer = new int[list.size()];
//    for(int i = 0; i < list.size(); i++) {
//      answer[i] = 
//    }
//
//    System.out.println(Arrays.toString(answer));
//
//    return answer;
//  }
//}

class Solution19 {
  public int[] solution(int[] numbers) {
    List<Integer> list = new LinkedList<>();

    for (int i = 0; i < numbers.length; i ++) {
      for (int j = i+1; j < numbers.length; j++) {
        int num = numbers[i] + numbers[j];
        list.add(num);
      }
    }

    System.out.println(list.size());

    TreeSet<Integer> treeSet = new TreeSet<>(list);
    List<Integer> answer2 = new ArrayList<>(treeSet);
    System.out.println(answer2);
    int[] answer = new int[answer2.size()];
    for(int i = 0; i < answer2.size(); i++) {
      answer[i] = answer2.get(i);
    }

    System.out.println(Arrays.toString(answer));

    return answer;
  }
}