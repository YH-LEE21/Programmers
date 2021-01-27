class Solution {
    public long solution(long n) {
        double a=Math.sqrt(n);
        int s=(int)a;
        return s==a? (long)Math.pow(s+1,2):-1;
    }
}
