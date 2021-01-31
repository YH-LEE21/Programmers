class Solution {
    public boolean solution(int x) {
        int y=0;
        int z=x;
        while(x>0){
            y+=x%10;
            x=x/10;
        }
        return z%y==0? true:false;
    }
}
