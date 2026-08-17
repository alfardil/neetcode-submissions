class Solution {
  // input: nums = [1,2,2,3,3,3], k = 2
  // output: [2,3]
  public int[] topKFrequent(int[] nums, int k) {
    Map<Integer, Integer> numsWithFreq = new HashMap<>();
    List<Integer>[] frequencies = new List[nums.length + 1];

    // populate map with freqs
    for (int num : nums) {
      numsWithFreq.put(num, numsWithFreq.getOrDefault(num, 0) + 1);
    }

    for (int i = 0; i < frequencies.length; i++) {
      frequencies[i] = new ArrayList<>();
    }

    for (Map.Entry<Integer, Integer> entry : numsWithFreq.entrySet()) {
      int key = entry.getKey();
      int val = entry.getValue();
      frequencies[val].add(key);
    }

    int[] result = new int[k];
    int index = 0;

    for (int i = frequencies.length - 1; i > 0 && index < k; i--) {
      for (int n : frequencies[i]) {
        result[index] = n;
        index++;
        if (index >= k) {
          return result;
        }
      }
    }

    return result;

  }
}