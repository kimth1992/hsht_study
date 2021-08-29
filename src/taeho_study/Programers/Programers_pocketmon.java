package taeho_study.Programers;

public class Programers_pocketmon {

  public static void main(String[] args) {

    int[] nums = {3,1,2,3};
    int[] nums2 =  {3,3,3,2,2,4};
    int[] nums3 =  {1,1,1,1,1};


    Solution11 sol = new Solution11();

    System.out.println(sol.solution(nums));
    System.out.println(sol.solution(nums2));
    System.out.println(sol.solution(nums3));

  }

}

class Solution11 {
  public int solution(int[] nums) {
    int answer = 0;
    int[] arr = new int[200001];

    for(int i = 0 ; i < nums.length; i ++) { 
      answer++;
      arr[nums[i]]++;
      if(arr[nums[i]] >1) {
        answer--;
      }
    }

    if(answer >= (nums.length /2) ) {
      return (nums.length /2);
    }

    return answer;
  }
}