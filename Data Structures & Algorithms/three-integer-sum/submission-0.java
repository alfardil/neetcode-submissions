class Solution {
  public List<List<Integer>> threeSum(int[] nums) {
    // sort the nums
    List<List<Integer>> res = new ArrayList<>();
    Arrays.sort(nums);

    for (int i = 0; i < nums.length; i++) {
      if (nums[i] > 0)
        break;
      if (i > 0 && nums[i] == nums[i - 1]) {
        continue;
      }

      int left = i + 1;
      int right = nums.length - 1;

      // do two sum ii here
      while (left < right) {
        int sum = nums[i] + nums[left] + nums[right];

        if (sum > 0) {
          right--;
          continue;
        } else if (sum < 0) {
          left++;
          continue;
        } else {
          // we have a match
          // sum == 0
          res.add(Arrays.asList(nums[i], nums[left], nums[right]));
          left++;
          right--;
          while (left < right && nums[left] == nums[left - 1]) {
            left++;
          }
        }
      }
    }

    return res;

  }
}