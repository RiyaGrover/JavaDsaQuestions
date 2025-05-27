//https://leetcode.com/problems/repeated-string-match/description/

class Solution {
    public int repeatedStringMatch(String a, String b) {
        int minRepeats = (b.length() + a.length() - 1) / a.length();
        String repeated = a.repeat(minRepeats);
        
        if (containsKarp(repeated, b)) return minRepeats;

        repeated += a;
        if (containsKarp(repeated, b)) return minRepeats + 1;

        return -1;
    }

    private boolean containsKarp(String text, String pattern) {
        int base = 256;
        int mod = 1_000_000_007;

        int m = pattern.length();
        int n = text.length();

        long patternHash = 0;
        long textHash = 0;
        long power = 1;

        // Precompute base^(m-1)
        for (int i = 1; i < m; i++) {
            power = (power * base) % mod;
        }

        // Compute initial hashes
        for (int i = 0; i < m; i++) {
            patternHash = (patternHash * base + pattern.charAt(i)) % mod;
            textHash = (textHash * base + text.charAt(i)) % mod;
        }

        for (int i = 0; i <= n - m; i++) {
            if (patternHash == textHash) {
                if (text.substring(i, i + m).equals(pattern)) {
                    return true;
                }
            }

            // Rolling hash update
            if (i + m < n) {
                textHash = (textHash - text.charAt(i) * power % mod + mod) % mod;
                textHash = (textHash * base + text.charAt(i + m)) % mod;
            }
        }

        return false;
    }
}
