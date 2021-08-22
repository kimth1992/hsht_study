package taeho_study.Programers;

//[[100,90,98,88,65],[50,45,99,85,77],[47,88,95,80,67],[61,57,100,80,65],[24,90,94,75,65]]

public class juri {

  public static void main(String[] args) {

    int[][] scores = {
        {100,90,98,88,65},
        {50,45,99,85,77},
        {47,88,95,80,67},
        {61,57,100,80,65},
        {24,90,94,75,65}
    };
    Solution10 sol = new Solution10();
    String answer = sol.solution(scores);
    System.out.println(answer);
  }
}

class Solution10 {
  public String solution(int[][] scores) {
    String answer = "";
    int total = 0;
    float average = 0;
    int k = 0; // student num

    for (int i = 0; i < scores.length; i++) {
      average = 0;
      int max = scores[0][i];
      int min = scores[0][i];

      for (int j = 0; j < scores[i].length; j++) {
        total += scores[j][i];

        if (scores[j][i] > max) {
          max = scores[j][i];
        }

        if (scores[j][i] < min) {
          min = scores[j][i];
        }


        if (scores[j][k] == max || scores[j][k] == min) {
          total -= scores[j][k];
          //    average = total / (scores.length - 1);
        } else {
          total += scores[j][k];
        }
      }
      average = total / scores.length;

      if (average >= 90) {
        answer += "A";
      } else if (average >= 80 && average < 90) {
        answer += "B";
      } else if (average >= 70 && average < 80) {
        answer += "C";
      } else if (average >= 50 && average < 70) {
        answer += "D";
      } else {
        answer += "F";
      }


    }

    return answer;

  }
}