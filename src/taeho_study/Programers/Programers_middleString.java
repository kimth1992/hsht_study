package taeho_study.Programers;

public class Programers_middleString {

  public static void main(String[] args) {

    String s = "abef";
    Solution50 sol = new Solution50();
    System.out.println(sol.solution(s));

  }

}


class Solution50 {
  public String solution(String s) {

    String answer = "";
    int size = s.length();

    if(size %2 == 0) {
      answer = s.substring(size/2-1, size/2 +1);
    } else {
      answer = s.substring(size/2, size/2 +1);
    }


    return answer;
  }
}



/*
    String answer = "";
    int size = 0;
    size = s.length();

    if(size % 2 == 0) {
      char[] c = new char[s.length()];
      for(int i = 0; i < s.length() ; i++) {
        c[i] = s.charAt(i);
      }
      answer += c[s.length()/2-1];
      answer += c[s.length()/2];
    } else {
      char[] c = new char[s.length()];
      for(int i = 0; i < s.length() ; i++) {
        c[i] = s.charAt(i);
      }
      answer += c[s.length()/2];
    }

    return answer;
 */