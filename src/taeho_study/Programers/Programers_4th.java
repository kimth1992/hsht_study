package taeho_study.Programers;

public class Programers_4th {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    String[] table = {"SI JAVA JAVASCRIPT SQL PYTHON C#", 
        "CONTENTS JAVASCRIPT JAVA PYTHON SQL C++", 
        "HARDWARE C C++ PYTHON JAVA JAVASCRIPT", 
        "PORTAL JAVA JAVASCRIPT PYTHON KOTLIN PHP", 
    "GAME C++ C# JAVASCRIPT C JAVA"};

    String[] languages = {"PYTHON", "C++", "SQL"};

    int[] preference = {7, 5, 5};


    Solution8 sol = new Solution8();
    sol.solution(table, languages, preference);

  }

}

class Solution8 {
  public String solution(String[] table, String[] languages, int[] preference) {
    String answer = "";

    // 2차원 배열로 만든 후에 작업하는게 더 좋다고 생각
    String[][] arr;

    for(int i = 0 ; i < table.length; i++) {
      arr[i][0] = table[i].split(arr);
    }





    return answer;
  }



}