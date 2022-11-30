package StringsNArrays;

public class day3 {

  public int minStartValue(int[] nums) {

    int startValue = 1;

    while (true) {

      int total = startValue;
      boolean isValid = true;

      for (int num : nums) {
        total += num;

        if (total < 1) {
          isValid = false;
          break;
        }
      }

      if (isValid) {
        return startValue;
      } else {
        startValue++;
      }
    }
  }

  public int minStartValueSolution2(int[] nums) {
    int n = nums.length;
    int m = 100;

    int left = 1;
    int right = m * n + 1;

    while (left < right) {

      int middle = (left + right) / 2;
      int total = middle;
      boolean isValid = true;

      for (int num : nums) {
        total += num;

        if (total < 1) {
          isValid = false;
          break;
        }
      }

      if (isValid) {
        return middle;
      } else {
        left = middle + 1;
      }
    }
    return left;
  }

  public int minStartValueSolution3(int[] nums) {
    int min_val = 0;
    int total = 0;

    for (int num : nums) {
      total += num;
      min_val = Math.min(min_val, total);
    }

    return -min_val + 1;
  }
}
