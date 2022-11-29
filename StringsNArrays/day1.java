package StringsNArrays;
import java.util.*;

public class day1 {

  public static int[] squaredSortSolution1(int[] nums){
    int[] squaredArr = new int[nums.length];

    for(int i = 0; i < nums.length; i++){
      squaredArr[i] = nums[i];
    }
  
    Arrays.sort(squaredArr);
    return squaredArr;
  }

  public static int[] squaredSortSolution2(int[] nums){
    for(int k = 0; k < nums.length; k++){
      nums[k] *= nums[k];
    }
    
    for(int i = 0; i < nums.length - 1; i++){
      for(int j = i + 1; j < nums.length - 1; j++){  
        if(nums[j] < nums[i]){
          int temp = nums[j];
          nums[j] = nums[i];
          nums[i] = temp;
        }
      }
    }
    return nums;
  }

  public static int[] squaredSortSolution3(int[] nums) {
    int[] result = new int[nums.length];
    int right = nums.length - 1;
    int left = 0;

    for (int i = nums.length - 1; i >= 0; i--) {
      int square;
      if (Math.abs(nums[left]) < Math.abs(nums[right])) {
        square = nums[right--];
      } else {
        square = nums[left++];
      }
      result[i] = square * square;
    }
    return result;
  }

  public static void reverseString(char[] s){
    int frontP = 0;
	  int backP = s.length - 1;

    while(frontP < backP){ 
      // swap characters
      char temp = s[frontP]; 
      s[frontP++] = s[backP]; 
      s[backP--] = temp; 
    }
  }

  public static void reverseStringSolution2(char[] s){
    _helper(s, 0, s.length - 1);
  }

  public static void _helper(char[] s, int start, int end){
    if(start >= end) return;

    char temp = s[start];
    s[start++] = s[end];
    s[end--] = temp;

    _helper(s, start, end);
  }
}
