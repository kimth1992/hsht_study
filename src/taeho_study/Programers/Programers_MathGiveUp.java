package taeho_study.Programers;

import java.util.ArrayList;

public class Programers_MathGiveUp {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    int[] answer = {1,2,3,4,5};
    Solution35 sol = new Solution35();
    sol.solution(answer);

  }

}


class Solution35 {
  public int[] solution(int[] answer) {
    int[] a = {1, 2, 3, 4, 5};
    int[] b = {2, 1, 2, 3, 2, 4, 2, 5};
    int[] c = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
    int[] score = new int[3];
    for(int i=0; i<answer.length; i++) {
      if(answer[i] == a[i%a.length]) {score[0]++;}
      if(answer[i] == b[i%b.length]) {score[1]++;}
      if(answer[i] == c[i%c.length]) {score[2]++;}
    }
    int maxScore = Math.max(score[0], Math.max(score[1], score[2]));

    System.out.println(maxScore);

    ArrayList<Integer> list = new ArrayList<>();


    //    if(maxScore == score[0]) {
    //      list.add(1);
    //      if(score[1] >= score[2]) {
    //        list.add(2);
    //        list.add(3);
    //      } else {
    //        list.add(3);
    //        list.add(2);
    //      }
    //    }
    //
    //    if(maxScore == score[1]) {
    //      list.add(2);
    //      if(score[0] >= score[2]) {
    //        list.add(1);
    //        list.add(3);
    //      } else {
    //        list.add(3);
    //        list.add(1);
    //      }
    //    }
    //
    //    if(maxScore == score[2]) {
    //      list.add(3);
    //      if(score[0] >= score[1]) {
    //        list.add(1);
    //        list.add(2);
    //      } else {
    //        list.add(2);
    //        list.add(1);
    //      }
    //    }

    if(maxScore == score[0]) {list.add(1);}
    if(maxScore == score[1]) {list.add(2);}
    if(maxScore == score[2]) {list.add(3);}



    System.out.println(list);
    int[] arr = new int[list.size()];
    for(int i = 0 ; i < list.size(); i++) {
      arr[i] = list.get(i);
    }



    return arr;
  }
}

//    if(maxScore == score[0]) {list.add(1);}
//    if(maxScore == score[1]) {list.add(2);}
//    if(maxScore == score[2]) {list.add(3);}
//    return list.stream().mapToInt(i->i.intValue()).toArray();


