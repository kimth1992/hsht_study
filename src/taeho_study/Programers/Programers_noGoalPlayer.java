package taeho_study.Programers;

import java.util.Arrays;

public class Programers_noGoalPlayer {
  public static void main(String[] args) {

    Solution31 sol = new Solution31();
    String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
    String[] completion = {"josipa", "filipa", "marina", "nikola"};
    System.out.println(sol.solution(participant, completion));
  }

}

class Solution31 {
  public String solution(String[] participant, String[] completion) {
    String answer = "";

    Arrays.sort(participant);
    Arrays.sort(completion);

    int i = 0;
    for( i = 0; i < completion.length;i ++) {
      if(!(participant[i].equals(completion[i]))){
        answer = participant[i];
      }
    }

    return participant[i];
  }
}


//class Solution {
//  public String solution(String[] participant, String[] completion) {
//      String answer = "";
//      HashMap<String, Integer> hm = new HashMap<>();
//      for (String player : participant) hm.put(player, hm.getOrDefault(player, 0) + 1);
//      for (String player : completion) hm.put(player, hm.get(player) - 1);
//
//      for (String key : hm.keySet()) {
//          if (hm.get(key) != 0){
//              answer = key;
//          }
//      }
//      return answer;
//  }
//}