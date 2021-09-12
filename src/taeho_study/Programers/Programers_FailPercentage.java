package taeho_study.Programers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Programers_FailPercentage {

  public static void main(String[] args) {

    int N = 5;
    int[] stages = {1,1,1,1,2,2,2};
    //int[] stages = {4,4,4,4};
    Solution24 sol = new Solution24();
    System.out.println(sol.solution(N, stages));


  }

}


class Solution24 {
  public int[] solution(int N, int[] stages) {
    double[] failrate = new double[N];

    int playerNum = stages.length;
    int cnt = 0;

    for (int i = 0; i < N; i++) {
      for(int j = 0; j < stages.length; j++) {
        if(stages[j] == i+1) {
          cnt++;
        }
      }
      System.out.printf("%d일때 cnt = %d, playernum = %d 이다.\n", i+1, cnt, playerNum);
      if(playerNum ==0) {
        playerNum++;
      }
      failrate[i] = (double)cnt / playerNum;
      playerNum -= cnt;
      cnt = 0;
    }

    for(int i = 0; i < failrate.length ; i++) {
      System.out.printf("%d 스테이지 실패율 = %f\n" ,i+1 ,failrate[i]);
    }

    Map<Integer, Double> map = new HashMap<Integer, Double>();
    for(int i = 0; i < N; i++) {
      map.put(i+1, failrate[i]);
    }

    List<Integer> keySetList = new ArrayList<>(map.keySet());
    Collections.sort(keySetList, (o1,o2) -> (map.get(o2).compareTo(map.get(o1))));


    int[] answer = new int[N];
    for( int i = 0 ; i < N; i++) {
      answer[i] = keySetList.get(i);
    }



    for(int i = 0; i < answer.length; i++) {
      System.out.println(answer[i]);
    }





    return answer;
  }
}