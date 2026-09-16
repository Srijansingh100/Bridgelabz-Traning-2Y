class Solution {
    public int numberOfSets(int n, int k) {
        long MOD = 1_000_000_007;
        
        // The answer is (n + k - 1) Choose (2 * k)
        int totalPoints = n + k - 1;
        int choose = 2 * k;
        
        if (choose > totalPoints) return 0;
        
        long numerator = 1;
        long denominator = 1;
        
        // Standard combination loop calculating nCr % MOD using modular inverse
        for (int i = 0; i < choose; i++) {
            numerator = (numerator * (totalPoints - i)) % MOD;
            denominator = (denominator * (i + 1)) % MOD;
        }
        
        // Multiply by the modular multiplicative inverse of the denominator
        return (int) ((numerator * modInverse(denominator, MOD)) % MOD);
    }
    
    // Fermat's Little Theorem for modular inverse
    private long modInverse(long base, long mod) {
        return power(base, mod - 2, mod);
    }
    
    private long power(long base, long exp, long mod) {
        long res = 1;
        base = base % mod;
        while (exp > 0) {
            if (exp % 2 == 1) {
                res = (res * base) % mod;
            }
            base = (base * base) % mod;
            exp /= 2;
        }
        return res;
    }
}
