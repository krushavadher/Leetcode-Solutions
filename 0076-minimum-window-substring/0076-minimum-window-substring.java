class Solution {
    public String minWindow(String s, String t) {

        int[] freq = new int[128];

    
        int req = 0;
        for (char ch : t.toCharArray()) {
            if (freq[ch] == 0) {
                req++;
            }
            freq[ch]++;

        }
        int[] window = new int[128];
        int c = 0;
        int i = 0;
        int st = 0;
        int min = Integer.MAX_VALUE;

        for (int j = 0; j < s.length(); j++) {
            char ch = s.charAt(j);

            window[ch]++;
            if (window[ch] == freq[ch]) {
                c++;
            }
            while (c == req) {
                if (j - i + 1 < min) {
                    min = j - i + 1;
                    st = i;
                }
                char chr = s.charAt(i);
                window[chr]--;

                if (window[chr] < freq[chr]) {
                    c--;
                }
                i++;
            }

        }
        return min == Integer.MAX_VALUE ? "" : s.substring(st, st + min);
    }
}