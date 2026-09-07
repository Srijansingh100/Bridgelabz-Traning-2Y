class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> result = new ArrayList<>();

        if (s.length() < p.length()) {
            return result;
        }

        int[] countP = new int[26];
        int[] countWindow = new int[26];

        // p ke characters count karo
        for (char ch : p.toCharArray()) {
            countP[ch - 'a']++;
        }

        int windowSize = p.length();

        // First window
        for (int i = 0; i < windowSize; i++) {
            countWindow[s.charAt(i) - 'a']++;
        }

        // Check first window
        if (Arrays.equals(countP, countWindow)) {
            result.add(0);
        }

        // Sliding window
        for (int i = windowSize; i < s.length(); i++) {

            // New character add
            countWindow[s.charAt(i) - 'a']++;

            // Old character remove
            countWindow[s.charAt(i - windowSize) - 'a']--;

            // Anagram found
            if (Arrays.equals(countP, countWindow)) {
                result.add(i - windowSize + 1);
            }
        }

        return result;
    }
}