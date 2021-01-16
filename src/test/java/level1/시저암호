class Solution {
    public String solution(String s, int n) {
        String answer = "";
        StringBuffer textLine = new StringBuffer();
        int[] cut = new int[s.length()];
        for(int i=0;i<s.length();i++){
            cut[i] = s.charAt(i);
            
            if(64<s.charAt(i)&&s.charAt(i)<91){
                cut[i]+=n;
                if(cut[i]>90){
                    int temp = cut[i]-90;
                    cut[i]=temp+64;
                }
            }
            if(96<s.charAt(i)&&s.charAt(i)<123){
                cut[i]+=n;
                if(cut[i]>122){
                    int temp = cut[i]-122;
                    cut[i]=temp+96;
                }
            }
        }
        for(int i=0;i<cut.length;i++){
            textLine.append((char)cut[i]);
        }
        answer=textLine.toString();
        return answer;
    }
}
