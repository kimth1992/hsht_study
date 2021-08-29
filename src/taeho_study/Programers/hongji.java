package taeho_study.Programers;

class Solution {
  public String solution(int[][] scores) {

    String answer = "";
    for (int i=0; i<scores.length; i++) {
      answer += calc(scores, i);
    }
    return answer;
  }

  public String calc(int[][] scores,int i) {
    int label = scores[i][i];
    int sum=label;
    boolean check = false; //전체평균일땐 ture로 변경.
    for (int j=0; j<scores.length; j++) {
      if (j!=i) {
        sum+=scores[j][i];
        if (label==scores[j][i]) {
          check = true;
        } 
      }
    }
    if (check) {
      return grade(sum/scores.length);
    } else {
      sum -= label;
    }
    return grade(sum/(scores.length-1));
  }

  public String grade(double score) {
    if (score>=90) {
      return "A";
    } else if (score>=80) {
      return "B";
    } else if (score>=70) {
      return "C";
    } else if (score>=50) {
      return "D";
    } else {
      return "F";
    }
  }
}