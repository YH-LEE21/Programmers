import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        int count=0;
        int n=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%divisor==0){
                count++;
            }
        }
        int []answer=new int[count];
        for(int i=0;i<answer.length;i++){
            do{
                if(arr[n]%divisor==0){
                    answer[i]=arr[n];
                    n++;
                    break;
                }
                else{
                    n++;
                }
            }while(n<arr.length);
        }
        if(count==0){
            count=1;
            int []answer1=new int[count];
            answer1[0]=-1;
            answer=answer1;
        }
        Arrays.sort(answer);
        return answer;
    }
}
