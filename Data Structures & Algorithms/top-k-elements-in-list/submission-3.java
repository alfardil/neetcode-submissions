class Solution {

  public int[] topKFrequent(int[] nums, int k) {

    Map<Integer, Integer> freqMap = new HashMap<>();
    for (int num : nums) {
      freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
    }

    List<Integer>[] freqs = new List[nums.length + 1];
    for (int i = 0; i < freqs.length; i++) {
      freqs[i] = new ArrayList<>();
    }

    for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
      int key = entry.getKey();
      int val = entry.getValue();
      freqs[val].add(key);
    }
    // input: [1,2,2,2,3,3,3]
    // rn: [[1], [], [2,3], [], [], [], []]

    int index = 0;
    int[] result = new int[k];
    for (int i = freqs.length - 1; i > 0 && index < k; i--) {

      for (int num : freqs[i]) {
        result[index++] = num;
        if (index >= k) {
          return result;
        }
      }
    }

    return result;

  }


}