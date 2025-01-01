package org.example.jan;

public class MaximumScoreAfterSplittingAString1442 {
    public int maxScore(String s) {
        int zeroScrore=0;
        int oneScrore=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                oneScrore+=1;
            }
        }
        int maxScore=0;
        if(s.charAt(0)=='0'){
            zeroScrore=1;
        }else{
            zeroScrore=-1;
        }
        maxScore=zeroScrore+oneScrore;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)=='0'){
                zeroScrore++;
            }
            if(s.charAt(i)=='1'){
                oneScrore--;
            }
            if(i<s.length()-1) {
                maxScore = Math.max(maxScore, zeroScrore + oneScrore);
            }
        }
        return maxScore;
    }
}
