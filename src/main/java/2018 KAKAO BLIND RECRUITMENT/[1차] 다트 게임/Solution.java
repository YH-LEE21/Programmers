import java.util.*;
class Solution {
    public int solution(String dartResult) {
        char[] darts = dartResult.toCharArray();
        int[] score = new int[3];
        int count=-1;
        for(int i=0;i<darts.length;i++){
            if(darts[i]>='0' && darts[i]<='9'){
                count++;
                if(darts[i]=='1'&&darts[i+1]=='0'){
                    score[count]=10;
                    i++;
                }
                else{
                    score[count]=darts[i]-'0';
                }
            }
            else if(darts[i]=='D'){
                score[count]*=score[count];
            }
            else if(darts[i]=='T'){
                score[count]*=score[count]*score[count];
            }
            else if(darts[i]=='*'){
                if(count>0){
                    score[count-1]*=2;
                }
                score[count]*=2;
            }
            else if(darts[i]=='#'){
                score[count]*=-1;
            }
        }
        return score[0]+score[1]+score[2];
    }
}
