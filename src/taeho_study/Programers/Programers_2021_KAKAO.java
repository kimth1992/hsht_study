package taeho_study.Programers;

//아이디의 길이는 3자 이상 15자 이하여야 합니다.
//아이디는 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.) 문자만 사용할 수 있습니다.
//단, 마침표(.)는 처음과 끝에 사용할 수 없으며 또한 연속으로 사용할 수 없습니다.


public class Programers_2021_KAKAO {

  public static void main(String[] args) {

    Solution5 sol = new Solution5();
    String answer = sol.solution("........................");
    System.out.println(answer);
  }

}

class Solution5 {
  public String solution(String new_id) {
    String answer = "";
    String id = "";
    char a = ' ';


    //1단계 new_id의 모든 대문자를 대응되는 소문자로 치환합니다.
    for(int i = 0 ; i < new_id.length() ; i++) {
      a = new_id.charAt(i);
      if(a <= 'Z' && a >= 'A') {
        a = (char)(a + 32);
      }
      id += a;
    }
    //    id = new_id.toLowerCase();

    System.out.println(id + " < = 1단계");

    //    2단계 new_id에서 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거합니다.
    for(int i = 0 ; i < id.length() ; i++) {    
      a = id.charAt(i);
      if((a >= 'a' && a <= 'z') || a == '-' || a == '_' || a == '.' || (a>='0' && a<='9'))
        answer += a;
    }

    //    answer = id.replaceAll("[^a-z0-9-_.]", "");

    System.out.println(answer + " < = 2단계");

    //3단계 new_id에서 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환합니다.

    while(true) {
      int cnt = 0;
      for(int i = 0 ; i < answer.length(); i++) {
        if(i >= 1) {
          if((answer.charAt(i) == answer.charAt(i-1)) && (answer.charAt(i) == '.')) { 
            if(i != answer.length() -1) {
              answer = answer.substring(0, i) + answer.substring(i+1, answer.length() );
            } else {
              answer = answer.substring(0, answer.length()-2);
            }
          }
        }
      }

      for(int i = 0 ; i < answer.length(); i++) {
        if(i >= 1) {
          if((answer.charAt(i) == answer.charAt(i-1)) && (answer.charAt(i) == '.')) { 
            cnt++;
          }
        }
      }

      if(cnt == 0)
        break;

    }
    //    answer = answer.replaceAll("[.]+", ".");   

    System.out.println(answer+ " < = 3단계");


    //4단계 new_id에서 마침표(.)가 처음이나 끝에 위치한다면 제거합니다.  * 얘가 문제가 많은듯

    while(true) {
      if(answer.length() != 0) {
        if(answer.charAt(0) == '.') {
          answer = answer.substring(1);
        } else if(answer.charAt(answer.length()-1) == '.') {
          answer =  answer.substring(0, answer.length()-1);
        } else {
          break;
        }
      }
      else {
        answer = "";
        break;
      }
    }
    //    answer = answer.charAt(0) == '.' ? answer.substring(1) : answer;
    //    answer = answer.length() > 0 && answer.charAt(answer.length() - 1) == '.' ? answer.substring(0, answer.length() - 1) : answer;



    System.out.println(answer+ " < = 4단계");

    //5단계 new_id가 빈 문자열이라면, new_id에 "a"를 대입합니다.
    if(answer.length() == 0) 
      answer = "a";

    System.out.println(answer + " < = 5단계");


    //6단계 new_id의 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거합니다.
    //  만약 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거합니다.

    if(answer.length() >= 16) {
      answer = answer.substring(0, 15);
    }

    if(answer.charAt(answer.length()-1) == '.') {
      answer = answer.substring(0, answer.length() -1);
    } 


    System.out.println(answer +  " < = 6단계");

    //7단계 new_id의 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서
    //끝에 붙입니다.

    while(answer.length() < 3) {
      answer += answer.charAt(answer.length() - 1);
    }

    return answer;
  }
}
