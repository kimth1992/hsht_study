package taeho_study.Programers;

// [[1,1,0,0,1,0],[0,0,1,0,1,0],[0,1,1,0,0,1],[1,1,0,1,1,1],[1,0,0,0,1,0],[0,1,1,1,0,0]]
// [[1,0,0,1,1,0],[1,0,1,0,1,0],[0,1,1,0,1,1],[0,0,1,0,0,0],[1,1,0,1,1,0],[0,1,0,0,0,0]]

public class Programers_3rd {

  public static void main(String[] args) {

    Solution3 sol = new Solution3();
    int[][] game_board = {
        {1,1,0,0,1,0},
        {0,0,1,0,1,0},
        {0,1,1,0,0,1},
        {1,1,0,1,1,1},
        {1,0,0,0,1,0},
        {0,1,1,1,0,0}
    };

    int[][] table = {
        {1,0,0,1,1,0},
        {1,0,1,0,1,0},
        {0,1,1,0,1,1},
        {0,0,1,0,0,0},
        {1,1,0,1,1,0},
        {0,1,0,0,0,0}
    };

    int answer = sol.solution(game_board, table);
    System.out.println(answer);

  }

}

class Solution3 {
  public int solution(int[][] game_board, int[][] table) {
    int answer = -1;

    for(int i = 0 ; i < game_board.length ; i++) {

    }

    return answer;
  }
}