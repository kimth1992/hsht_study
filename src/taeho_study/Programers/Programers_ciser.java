package taeho_study.Programers;

public class Programers_ciser {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    String s = "AaZz";
    //ZzYy
    Solution39 sol = new Solution39();
    System.out.println(sol.solution(s, 25));

  }

}

class Solution39 {
  public String solution(String s, int n) {
    String answer = "";

    for(int i = 0; i < s.length(); i++) {
      char a = s.charAt(i);
      if(a == 32) {
        answer+= a;
        continue;
      }

      if(a >= 97 && a <= 122) {
        a = (char)(a + n);
        if(a > 122) {
          a = (char)(a-26);
          answer+= a;
          continue;
        }
        answer+= a;
        continue;
      } else if(a >= 65 && a <= 90) {
        a = (char)(a + n);
        if(a > 90) {
          a = (char)(a-26);
          answer+= a;
          continue;
        }
        answer+= a;
        continue;
      }


    }
    return answer;
  }
}







//      else {
//        a= (char)(a + n);
//        if(a <= 90) {
//          answer+=a;
//          continue;
//        }
//        if( a> 90 && a < 97) {
//          a = (char)(a - 26);
//          answer+= a;
//          continue;
//        } else if(a <= 122) {
//          answer+= a;
//          continue;
//        }
//        else if(a > 122) {
//          a = (char)(a - 26);
//          answer+= a;
//          continue;
//        }
//        else {
//          a= (char)(a-26);
//          answer+= a;
//          continue;
//        }
//      }
//
//
//    }
//    return answer;
//  }
//
//}