class Solution {
  public boolean isAnagram(String s, String t) {
    if (s.length() != t.length())
      return false;

    Map<Character, Integer> map1 = new HashMap<>();
    Map<Character, Integer> map2 = new HashMap<>();

    char[] char1 = s.toCharArray();
    char[] char2 = t.toCharArray();

    for (char c : char1) {
      map1.put(c, map1.getOrDefault(c, 0) + 1);
    }

    for (char c : char2) {
      map2.put(c, map2.getOrDefault(c, 0) + 1);
    }

    return map1.equals(map2);
  }
}
