class Solution {
  public int[] twoSum(int[] numbers, int target) {
    int left = 0;
    int right = numbers.length - 1;
    int[] res = new int[2];

    while (left < right) {
      int leftn = numbers[left];
      int rightn = numbers[right];

      if (leftn + rightn == target) {
        res[0] = left + 1;
        res[1] = right + 1;
        return res;
      }

      if (leftn + rightn > target) {
        right--;
        continue;
      }

      if (leftn + rightn < target) {
        left++;
        continue;
      }
    }

    return res;

  }
}