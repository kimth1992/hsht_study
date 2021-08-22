package taeho_study.Programers;

//1번 스테이지에는 총 8명의 사용자가 도전했으며, 이 중 1명의 사용자가 아직 클리어하지 못했다. 
//따라서 1번 스테이지의 실패율은 다음과 같다.
//1 번 스테이지 실패율 : 1/8
//2번 스테이지에는 총 7명의 사용자가 도전했으며, 
//이 중 3명의 사용자가 아직 클리어하지 못했다. 따라서 2번 스테이지의 실패율은 다음과 같다.
//2 번 스테이지 실패율 : 3/7
//마찬가지로 나머지 스테이지의 실패율은 다음과 같다.
//3 번 스테이지 실패율 : 2/4
//4번 스테이지 실패율 : 1/2
//5번 스테이지 실패율 : 0/1
//각 스테이지의 번호를 실패율의 내림차순으로 정렬하면 다음과 같다.
//[3,4,2,1,5]


public class Programers_2019_KAKAO2 {

  public static void main(String[] args) {

    int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};
    Solution7 sol = new Solution7();
    System.out.println(sol.solution(5, stages));

  }

}


class Solution7 {
  public int[] solution(int N, int[] stages) {
    int[] answer = {};
    int cnt = 0;
    double[] per = {};


    for(int i = 0 ; i < stages.length ; i++) {
      if(stages[i] == 1) {
        cnt++;
      }
    }

    per[0] = (double)cnt / stages.length;








    return answer;
  }
}