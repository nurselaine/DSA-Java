package StringsNArrays;
import java.util.*;

public class day2{
  public static double findMaxAverage(int[] nums, int k){
    int window_sum = 0;
    for(int i = 0; i < k; i++){
      window_sum += nums[i];
    };

    double max_value = (double)(window_sum / k);

    for(int i = k; i < nums.length; i++){
      window_sum += nums[i] - nums[i -k];
      max_value = Math.max(max_value, (double)(window_sum / k));
    }
    return max_value;
  }

  public static int findLongestOnes(int[] nums, int k){
    int left = 0, right;

    for(right = 0; right < nums.length; right++){
      if(nums[right] == 0){
        k--;
      }

      if(k < 0){
        k += 1 - nums[left];
        left++;
      }
    }

    return right - left;
  }
}