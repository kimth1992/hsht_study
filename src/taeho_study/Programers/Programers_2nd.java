package taeho_study.Programers;



//[[100,90,98,88,65],[50,45,99,85,77],[47,88,95,80,67],[61,57,100,80,65],[24,90,94,75,65]] => "FBABD"
//[[50,90],[50,87]] => "DA"
//[[70,49,90],[68,50,38],[73,31,100]] => "CFD"

//FBABD
//DA
//CFD
//BCB
//BCD


public class Programers_2nd {

  static Solution2 sol = new Solution2();

  public static void main(String[] args) {

    int[][] scores = {
        {100,90,98,88,65},
        {50,45,99,85,77},
        {47,88,95,80,67},
        {61,57,100,80,65},
        {24,90,94,75,65}
    };

    int[][] scores2 = {
        {50,90},
        {50,87},
    };

    int[][] scores3 = {
        {70,49,90},
        {68,50,38},
        {73,31,100}
    };

    int[][] scores4 = {
        {68,71,92},
        {71,71,71},
        {100,92,100}
    };

    int[][] scores5 = {
        {75,50,100},
        {75,100,20},
        {100,100,20}
    };

    System.out.println(sol.solution(scores));
    System.out.println(sol.solution(scores2));
    System.out.println(sol.solution(scores3));
    System.out.println(sol.solution(scores4));
    System.out.println(sol.solution(scores5));

  }

}

class Solution2 {
  int score;
  int count;
  int min;
  int max;
  int myscore;
  int cnt;

  public String solution(int[][] scores) {

    double[] student = new double[scores.length]; // 평균을 담을 배열

    for(int i = 0; i < scores.length ; i++) {
      count = scores.length;
      myscore = scores[i][i]; 
      min = 101; // 87
      max = -1; // 87



      for(int j = 0 ; j < scores[i].length ; j++) {

        score += scores[j][i];

        if((i != j ) && (scores[j][i] == myscore)) {
          cnt++; // 같은숫자가 있음을 표시
        }

        if((i != j) && (scores[j][i] == myscore)) {
          cnt++;
        }

        if(scores[j][i] < min) {
          min = scores[j][i]; 
        }

        if(scores[j][i] > max) {
          max = scores[j][i];
        }


      }

      if( ( (cnt == 0) && (myscore == max) ) || ( (cnt == 0) && (myscore == min) ) )  {
        score -= myscore; // 90
        count--;    // 1
      }

      student[i] = (double)score / count;
      System.out.printf("student[%d] = score(%d) / count(%d) => %f\n", i, score, count, ((double)score/count) );
      score = 0;
      cnt = 0;

    }
    String answer = cutline(student);
    return answer;

  }

  public String cutline(double[] student) {
    double score;
    String answer = "";
    for(int i = 0 ; i < student.length ; i++) {
      score = student[i];
      if(score >= 90) {
        answer += "A";
      } else if(score <90 && score >= 80) {
        answer += "B";

      } else if(score <80 && score >= 70) {
        answer += "C";

      } else if(score <70 && score >= 50) {
        answer += "D";

      } else {
        answer += "F";
      }
    }
    return answer;
  }

}


//기존 코드
//class Solution {
//int score;
//int count;
//int min;
//int max;
//int myscore;
//
//public String solution(int[][] scores) {
//
// double[] student = new double[scores.length];
//
// for(int i = 0; i < scores.length ; i++) {
//   count = scores.length;
//   myscore = scores[i][i];
//   min = 101;
//   max = -1;
//
//   for(int j = 0 ; j < scores[i].length ; j++) {
//     if(scores[j][i] < min) {
//       min = scores[j][i]; 
//     }
//     if(scores[j][i] > max) {
//       max = scores[j][i];
//     }
//
//     score += scores[j][i];
//
//   }
//
//   if(myscore == max || myscore == min) {
//     score -= myscore;
//     count--;
//   }
//
//
//   student[i] = (double)score / count;
//   score = 0;
//   count = scores.length;
//
// }
//
// String answer = cutline(student);
// return answer;
//}
//
//public String cutline(double[] student) {
// double score;
// String answer = "";
// for(int i = 0 ; i < student.length ; i++) {
//   score = student[i];
//   if(score >= 90) {
//     answer += "A";
//   } else if(score <90 && score >= 80) {
//     answer += "B";
//
//   } else if(score <80 && score >= 70) {
//     answer += "C";
//
//   } else if(score <70 && score >= 50) {
//     answer += "D";
//
//   } else {
//     answer += "F";
//   }
// }
// return answer;
//}
//
//}