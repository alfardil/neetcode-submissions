class Solution {
  public String encode(List<String> strs) {
    StringBuilder sb = new StringBuilder();
    for (String str : strs) {
      sb.append(str.length()).append('#').append(str);
    }
    return sb.toString();

  }

  public List<String> decode(String str) {
    List<String> result = new ArrayList<>();
    // "5#hello5#world"
    int i = 0;
    while (i < str.length()) {
      int j = i;
      while (str.charAt(j) != '#') {
        j++;
      }
      // now we have the hashtag
      int length = Integer.parseInt(str.substring(i, j));
      i = j + 1;
      j = i + length;
      String orgString = str.substring(i, j);
      result.add(orgString);
      i = j;
    }

    return result;
  }

}