package org.example.jan;

public class CountVowelStringSInRanges2559V2 {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int[] rs=new int[queries.length];
        int[] vowelWord=new int[words.length];//mảng lưu số chuỗi hợp lệ tính để chỉ số i
        vowelWord[0]=(isVowel(words[0].charAt(0)) && isVowel(words[0].charAt(words[0].length() - 1)))?1:0;
        for (int i = 1; i < words.length; i++) {
            vowelWord[i]=vowelWord[i-1]+((isVowel(words[i].charAt(0)) && isVowel(words[i].charAt(words[i].length() - 1)))?1:0);
        }
        for(int i=0;i< queries.length;i++){
            int start = queries[i][0];
            int end = queries[i][1];
            rs[i] = vowelWord[end] - (start > 0 ? vowelWord[start - 1] : 0);
        }
        return  rs;
    }
    private boolean isVowel(char c) {
        return c=='u'||c=='e'||c=='o'||c=='a'||c=='i';
    }
}
