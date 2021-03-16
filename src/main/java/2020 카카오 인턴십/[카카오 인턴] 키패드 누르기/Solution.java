class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        switch(hand){
            case "right":
                hand="R";
                break;
            case "left":
                hand="L";
                break;
        }
        int left=10;//왼손 시작 위치
        int right=12;//오른손 시작 위치
        for(int i=0;i<numbers.length;i++){
            int num=numbers[i];
            int countL=0;
            int countR=0;
            switch(num){
                case 1:case 4:case 7:
                    left=num;
                    answer+="L";
                    break;
                case 3:case 6:case 9:
                    right=num;
                    answer+="R";
                    break;
                default:
                    if(num==0){
                        num=11;
                    }
                        if(num>left){//ex num=8,left=3 가로1 세로 2
                            for(int j=left;num>j;j++){
                                    countL++;           
                            }
                        }
                        else{
                            for(int j=num;left>j;j++){
                                   countL++;
                            }
                        }
                        if(num>right){
                            for(int j=right;num>j;j++){
                                    countR++;
                            }
                        }
                        else{
                            for(int j=num;right>j;j++){
                                    countR++;
                             }
                         }
                    if(countL/3+countL%3>countR/3+countR%3){
                            answer+="R";
                            right=num;
                        }
                    else if(countL/3+countL%3<countR/3+countR%3){
                            answer+="L";
                            left=num;
                        }
                    else{
                            answer+=hand;
                            switch(hand){
                                case "R":
                                    right=num;
                                    break;
                                case "L":
                                    left=num;
                                    break;
                            }
                        }
            }
        }
        return answer;
    }
}
