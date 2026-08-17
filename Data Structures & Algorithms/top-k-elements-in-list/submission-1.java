class Solution {
  // input: nums = [1,2,2,3,3,3], k = 2
  // output: [2,3]
  public int[] topKFrequent(int[] nums, int k) {
    Map<Integer, Integer> numToFreq = new HashMap<>();

    // populate map with nums and their freqs
    for (int num : nums) {
      numToFreq.put(num, numToFreq.getOrDefault(num, 0) + 1);
    }

    List<Integer>[] freqArr = new List[nums.length + 1];
    for (int i = 0; i < freqArr.length; i++) {
      freqArr[i] = new ArrayList<>();
    }

    for (Map.Entry<Integer, Integer> entry : numToFreq.entrySet()) {
      int key = entry.getKey();
      int val = entry.getValue();

      freqArr[val].add(key);
    }

    int[] result = new int[k];
    int index = 0;

    for (int i = freqArr.length - 1; i > 0 && index < k; i--) {
      for (int n : freqArr[i]) {
        result[index] = n;
        index++;
        if (index == k) {
          return result;
        }

      }
    }

    return result;

  }
}