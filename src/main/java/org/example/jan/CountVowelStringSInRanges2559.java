package org.example.jan;

public class CountVowelStringSInRanges2559 {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int[] rs=new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int ans = 0;
            for (int j = queries[i][0]; j <= queries[i][1]; j++) {
                if (isVowel(words[j].charAt(0)) && isVowel(words[j].charAt(words[j].length() - 1))) {
                    ans++;
                }
            }
            rs[i] = ans;
        }
        return  rs;
    }
    private boolean isVowel(char c) {
        return c=='u'||c=='e'||c=='o'||c=='a'||c=='i';
    }
}
