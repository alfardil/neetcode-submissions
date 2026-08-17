class Solution {
  // input: strs = ["act","pots","tops","cat","stop","hat"]
  // output: [["hat"],["act", "cat"],["stop", "pots", "tops"]]
  public List<List<String>> groupAnagrams(String[] strs) {
    Map<String, List<String>> anagramLists = new HashMap<>();

    for (String str : strs) {
      char[] chars = str.toCharArray();
      Arrays.sort(chars);
      String key = new String(chars);
      anagramLists.putIfAbsent(key, new ArrayList<>());
      anagramLists.get(key).add(str);
    }

    // now we can put all the anagrams into a List
    List<List<String>> result = new ArrayList<>();
    for (List<String> anagrams : anagramLists.values()) {
      result.add(anagrams);
    }

    return result;

  }
}