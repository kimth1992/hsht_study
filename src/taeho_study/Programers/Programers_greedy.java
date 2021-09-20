package taeho_study.Programers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Programers_greedy {

  public static void main(String[] args) {

    int n = 10; 
    int[] lost = {5,4,3,2,1,9};
    int[] reserve = {5,6,7};

    Solution32 sol = new Solution32();
    System.out.println(sol.solution(n, lost, reserve));

  }

}

class Solution32 {
  public int solution(int n, int[] lost, int[] reserve) {
    int answer = 0;

    List<Integer> answerList = new ArrayList<>();
    for(int i = 0; i < n; i++) {
      answerList.add(i+1);
    }

    System.out.println("AnswerList = " + answerList);


    List<Integer> lostList = new ArrayList<>();
    for(int i = 0; i < lost.length; i++) {
      lostList.add(lost[i]);
    }

    Collections.sort(lostList);
    System.out.println("Lost = " + lostList);

    List<Integer> reserveList = new ArrayList<>();
    for(int i = 0; i < reserve.length; i++) {
      reserveList.add(reserve[i]);
    }

    Collections.sort(reserveList);
    System.out.println("reserve = " + reserveList);

    System.out.println("-------------------");

    if(lostList.size() >= reserveList.size()) {
      for(int i =reserveList.size()-1; i >= 0; i--) {
        if(lostList.contains(reserveList.get(i))) {
          int temp;
          temp = reserveList.get(i);
          reserveList.remove(i);
          lostList.remove(Integer.valueOf(temp));
        }
      } 
    }
    else {
      for(int i =lostList.size()-1; i >= 0; i--) { // reserveList가 더 클 경우
        if(reserveList.contains(lostList.get(i))) {
          int temp;
          temp = lostList.get(i);
          lostList.remove(i);
          reserveList.remove(Integer.valueOf(temp));
        }
      }
    }

    System.out.println("lostList = " + lostList);
    System.out.println("reserveList = " + reserveList);
    System.out.println("------- 같은거 지웠어");


    for(int i = lostList.size() - 1; i >= 0; i--) {

      for(int j = reserveList.size()-1; j >= 0; j--) { 
        System.out.printf("이 타이밍에 i는 %d, j는 %d 이다.\n", i , j);

        if(reserveList.get(j) == lostList.get(i) + 1 || reserveList.get(j) == lostList.get(i) - 1) {

          System.out.println("여기서 lostList에서 " + lostList.get(i) + "가 지워짐");
          lostList.remove(i);
          System.out.println("여기서 reserveList에서 " + reserveList.get(j) + "가 지워짐");
          reserveList.remove(j);
          System.out.println("아래는 lostList");
          System.out.println(lostList);
          System.out.println("아래는 reserveList");
          System.out.println(reserveList);
          System.out.println("-------------------");
          if(reserveList.size() ==0 || lostList.size() == 0) {
            answerList.removeAll(lostList);
            System.out.println("AnswerList = " + answerList);
            return answerList.size();
          }
          break;
        }
      }

    }

    answerList.removeAll(lostList);
    System.out.println("AnswerList = " + answerList);
    return answerList.size();
  }
}
