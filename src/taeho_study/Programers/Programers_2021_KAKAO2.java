package taeho_study.Programers;

//1478 → "one4seveneight"
//234567 → "23four5six7"
//10203 → "1zerotwozero3"

public class Programers_2021_KAKAO2 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    String s = "one4seveneight";
    Solution6 sol = new Solution6();
    System.out.println(sol.solution(s));

  }

}


class Solution6 {
  public int solution(String s) {
    int answer = 0;
    char a = ' ';
    String num = "";
    String str = "";
    String numbers[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

    for(int i = 0 ; i < numbers.length ; i++) {
      s = s.replaceAll(numbers[i], Integer.toString(i));
    }

    //    for(int i = 0 ; i < s.length() ; i++) {
    //      a = s.charAt(i);
    //      if(a >= '0' && a <= '9') {
    //        num += a;
    //      }
    //      else {
    //        str += a;
    //        if(str.equals("one")) {
    //          num += "1";
    //          str = "";
    //        } else if(str.equals("two")) {
    //          num += "2";
    //          str = "";
    //        } else if(str.equals("three")) {
    //          num += "3";
    //          str = "";
    //        } else if(str.equals("four")) {
    //          num += "4";
    //          str = "";
    //        } else if(str.equals("five")) {
    //          num += "5";
    //          str = "";
    //        } else if(str.equals("six")) {
    //          num += "6";
    //          str = "";
    //        } else if(str.equals("seven")) {
    //          num += "7";
    //          str = "";
    //        } else if(str.equals("eight")) {
    //          num += "8";
    //          str = "";
    //        } else if(str.equals("nine")) {
    //          num += "9";
    //          str = "";
    //        } else if(str.equals("zero")) {
    //          num += "0";
    //          str = "";
    //        }
    //      }
    //
    //    }

    answer = Integer.parseInt(s);


    return answer;
  }
}