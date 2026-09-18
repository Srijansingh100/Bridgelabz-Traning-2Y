class Solution {
    public List<String> maxNumOfSubstrings(String s) {

        List<String> ans = new ArrayList<>();

        int[][] range = new int[26][2];

        for (int i = 0; i < 26; i++) {
            range[i][0] = -1;
            range[i][1] = -1;
        }

        for (int i = 0; i < s.length(); i++) {
            int c = s.charAt(i) - 'a';

            if (range[c][0] == -1)
                range[c][0] = i;

            range[c][1] = i;
        }

        List<int[]> list = new ArrayList<>();

        for (int i = 0; i < 26; i++) {

            if (range[i][0] == -1)
                continue;

            int start = range[i][0];
            int end = range[i][1];
            boolean valid = true;

            for (int j = start; j <= end; j++) {

                int c = s.charAt(j) - 'a';

                if (range[c][0] < start) {
                    valid = false;
                    break;
                }

                end = Math.max(end, range[c][1]);
            }

            if (valid)
                list.add(new int[]{start, end});
        }

        list.sort((a, b) -> a[1] - b[1]);

        int prev = -1;

        for (int[] x : list) {

            if (x[0] > prev) {
                ans.add(s.substring(x[0], x[1] + 1));
                prev = x[1];
            }
        }

        return ans;
    }
}