class Solution {
  public int[] twoSum(int[] numbers, int target) {
    int left = 0;
    int right = numbers.length - 1;

    while (left < right) {
      int leftN = numbers[left];
      int rightN = numbers[right];
      int sum = leftN + rightN;

      if (sum < target) {
        left++;
      } else if (sum > target) {
        right--;
      } else {
        return new int[] { left + 1, right + 1 };
      }

    }

    return new int[] {};

  }
}