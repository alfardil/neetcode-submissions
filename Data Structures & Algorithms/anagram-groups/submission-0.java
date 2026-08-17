class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // map with ordered string as the key
        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            char[] sorted = str.toCharArray();
            Arrays.sort(sorted);
            String key = new String(sorted);
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(str);
        }

        return new ArrayList<>(map.values());
    }
}
