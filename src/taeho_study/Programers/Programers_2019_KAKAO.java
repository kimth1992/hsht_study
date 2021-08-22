package taeho_study.Programers;

public class Programers_2019_KAKAO {

  public static void main(String[] args) {

    int[][] board = {
        {0,0,0,0,0},
        {0,0,1,0,3},
        {0,2,5,0,1},
        {4,2,4,4,2},
        {3,5,1,3,1}
    };

    int[] moves = {1,5,3,5,1,2,1,4};

    Solution4 sol = new Solution4();
    int answer = sol.solution(board, moves);
    System.out.println(answer);

  }

}


class Solution4 {
  public int solution(int[][] board, int[] moves) {
    int answer = 0;
    int index = 0;

    int[] arr = new int[moves.length]; 

    for (int i = 0; i < moves.length; i++) {

      for (int j = 0; j < board.length; j++) {

        if (board[j][moves[i] - 1] != 0) {
          arr[index] = board[j][moves[i] - 1];

          if (index >= 1 && arr[index] == arr[index  -1]) {
            arr[index] = 0;
            arr[index - 1] = 0;
            index -= 2;
            answer += 2;
          }

          board[j][moves[i] - 1] = 0;
          index++;
          break;
        }

      }

    }
    return answer;
  }

}


//class Solution4 {
//  public int solution(int[][] board, int[] moves) {
//    int answer = 0;
//    int num = 0; // 
//
//    int[] arr = new int[moves.length]; // 8
//
//    for(int i = 0 ; i < moves.length ; i++) {
//
//      for(int j = 0 ; j < board.length ; j++) {
//
//        if(board[j][moves[i]-1] != 0) {
//          arr[num] = board[j][moves[i]-1];
//          board[j][moves[i]-1] = 0;
//
//          if(num >=1 && arr[num] == arr[num-1]) {
//            arr[num] = 0;
//            arr[num -1] = 0;
//            num -= 2;
//            answer += 2;
//          }
//          num++;
//          break;
//        }
//
//      }
//
//    }
//
//
//    return answer;
//  }
//}