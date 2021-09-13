package taeho_study.Programers;

public class Programers_KeyPad {

  public static void main(String[] args) {
    // TODO Auto-generated method stub


    int[] numbers = {1,3,4,5,8,2,1,4,5,9,5};
    String hand = "right";
    Solution28 sol = new Solution28();
    System.out.println(sol.solution(numbers, hand));


  }

}


class Solution28 {
  public String solution(int[] numbers, String hand) {
    String answer = "";
    char a = ' ';
    int LeftHand = 10;
    int RightHand = 12;
    double Leftdistance = 0.0;
    double Rightdistance = 0.0;

    for(int i = 0; i < numbers.length; i++) {

      int num = numbers[i];

      if(num == 1 || num == 4 || num == 7) {
        answer += "L";
        LeftHand = num;
      } else if(num == 3 || num == 6 || num == 9) {
        answer += "R";
        RightHand = num;
      } else {
        if(num == 0) 
          num = 11;

        Leftdistance = Math.abs((LeftHand - num) /3) + Math.abs((LeftHand -num) %3);
        Rightdistance = Math.abs((RightHand - num) /3) + Math.abs((RightHand -num) %3);

        if(Leftdistance < Rightdistance) {
          answer += "L";
          LeftHand = num;
        } else if(Leftdistance > Rightdistance) {
          answer += "R";
          RightHand = num;
        } else {
          if(hand.equals("right")) {
            answer += "R";
            RightHand = num;
          } else if(hand.equals("left")) {
            answer += "L";
            LeftHand = num;
          }
        }
      }
    }
    return answer;
  }
}