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
//제한사항
//스테이지의 개수 N은 1 이상 500 이하의 자연수이다.
//stages의 길이는 1 이상 200,000 이하이다.
//stages에는 1 이상 N + 1 이하의 자연수가 담겨있다.
//각 자연수는 사용자가 현재 도전 중인 스테이지의 번호를 나타낸다.
//단, N + 1 은 마지막 스테이지(N 번째 스테이지) 까지 클리어 한 사용자를 나타낸다.
//만약 실패율이 같은 스테이지가 있다면 작은 번호의 스테이지가 먼저 오도록 하면 된다.
//스테이지에 도달한 유저가 없는 경우 해당 스테이지의 실패율은 0 으로 정의한다.


public class Programers_2019_KAKAO2 {

  public static void main(String[] args) {

    int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};
    int[] stages2 = {4,4,4,4,4};
    Solution7 sol = new Solution7();
    System.out.println(sol.solution(5, stages));
    //System.out.println(sol.solution(4, stages2));

  }

}


class Solution7 {
  public int[] solution(int N, int[] stages) {
    int[] answer = {};
    int cnt = 0;
    double[] per = new double[N];
    int[] arr = new int[50000];
    int len = 0;
    int index = 0;

    for(int i = 0 ; i < stages.length; i++) {
      arr[stages[i]]++;
    }

    len = stages.length;

    for(int i = 0 ; i < arr.length ; i++) {
      if(i == N) 
        break;
      if(arr[i] != 0) {
        per[index] = arr[i] / (double)len;
        index++;
        len -= arr[i];
      }

    }

    double temp;
    for(int j = 0 ; j < per.length; j++) {
      for(int i = j ; i < per.length; i++) {
        if(i >=1) {
          if(per[i] > per[i-1]) {
            temp = per[i-1];
            per[i-1] = per[i];
            per[i] = temp;
          }
        }
      }
    }


    for(int i = 0 ; i < per.length; i++) {
      System.out.println(per[i]);
    }


    return answer;
  }
}