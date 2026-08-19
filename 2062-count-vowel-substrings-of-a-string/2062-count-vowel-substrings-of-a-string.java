class Solution {
    public int countVowelSubstrings(String word) {

        int count = 0;

        for (int i = 0; i < word.length(); i++) {

            int a = 0;
            int e = 0;
            int in = 0;
            int o = 0;
            int u = 0;

            for (int j = i; j < word.length(); j++) {

                char ch = word.charAt(j);

                if (ch == 'a')
                    a = 1;
                else if (ch == 'e')
                    e = 1;
                else if (ch == 'i')
                    in = 1;
                else if (ch == 'o')
                    o = 1;
                else if (ch == 'u')
                    u = 1;
                else
                    break;

                if (a == 1 && e == 1 && in == 1 && o == 1 && u == 1) {
                    count++;
                }
            }
        }

        return count;
    }
}