class Solution {
 
  public int trap(int[] height) {
    int n = height.length;
    int[] maxLeft = new int[n];
    int[] maxRight = new int[n];

    int max = 0;
    maxLeft[0] = 0;
    for (int i = 1; i < n; i++) {
      maxLeft[i] = Math.max(max, height[i - 1]);
      max = Math.max(maxLeft[i], max);
    }

    max = 0;
    maxRight[n - 1] = 0;
    for (int i = n - 2; i >= 0; i--) {
      maxRight[i] = Math.max(max, height[i + 1]);
      max = Math.max(maxRight[i], max);
    }

    int[] minLR = new int[n];
    int total = 0;
    for (int i = 0; i < n; i++) {
      minLR[i] = Math.min(maxLeft[i], maxRight[i]);

      int algo = minLR[i] - height[i];

      if (algo > 0) {
        total += algo;
      }
    }

    return total;

  }
}