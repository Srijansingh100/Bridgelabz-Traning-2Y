class Solution {
    public int totalFruit(int[] fruits) {
        int left = 0;
        int max = 0;

        int a = -1;
        int b = -1;

        for(int right = 0; right < fruits.length; right++) {

            if(fruits[right] != a && fruits[right] != b) {
                if(a == -1)
                    a = fruits[right];
                else if(b == -1)
                    b = fruits[right];
                else {
                    left = right - 1;

                    while(fruits[left] == fruits[right - 1])
                        left--;

                    left++;
                    a = fruits[right - 1];
                    b = fruits[right];
                }
            }

            max = Math.max(max, right - left + 1);
        }

        return max;
    }
}