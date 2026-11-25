import java.util.*;

class Solution {
    public int smallestUniqueSubarray(int[] nums) {

        int n = nums.length;

        if (n == 1) return 1;

        int[] sa = new int[n];
        int[] rank = nums.clone();

        for (int i = 0; i < n; i++) {
            sa[i] = i;
        }

        for (int k = 1; k < n; k *= 2) {

            final int len = k;
            final int[] r = rank;

            Integer[] order = new Integer[n];

            for (int i = 0; i < n; i++) {
                order[i] = sa[i];
            }

            Arrays.sort(order, (a, b) -> {

                if (r[a] != r[b]) {
                    return Integer.compare(r[a], r[b]);
                }

                int x = a + len < n ? r[a + len] : -1;
                int y = b + len < n ? r[b + len] : -1;

                return Integer.compare(x, y);
            });

            for (int i = 0; i < n; i++) {
                sa[i] = order[i];
            }

            int[] newRank = new int[n];

            for (int i = 1; i < n; i++) {

                int a = sa[i - 1];
                int b = sa[i];

                int a2 = a + len < n ? rank[a + len] : -1;
                int b2 = b + len < n ? rank[b + len] : -1;

                newRank[b] = newRank[a];

                if (rank[a] != rank[b] || a2 != b2) {
                    newRank[b]++;
                }
            }

            rank = newRank;

            if (rank[sa[n - 1]] == n - 1) {
                break;
            }
        }

        int[] pos = new int[n];

        for (int i = 0; i < n; i++) {
            pos[sa[i]] = i;
        }

        int[] lcp = new int[n];

        int h = 0;

        for (int i = 0; i < n; i++) {

            int p = pos[i];

            if (p == 0) {
                h = 0;
                continue;
            }

            int j = sa[p - 1];

            while (i + h < n && j + h < n &&
                   nums[i + h] == nums[j + h]) {
                h++;
            }

            lcp[p] = h;

            if (h > 0) h--;
        }

        int ans = n;

        for (int i = 0; i < n; i++) {

            int common = lcp[i];

            if (i + 1 < n) {
                common = Math.max(common, lcp[i + 1]);
            }

            int len = common + 1;

            if (len <= n - sa[i]) {
                ans = Math.min(ans, len);
            }
        }

        return ans;
    }
}