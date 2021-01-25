class Solution {
    public String solution(String s) {
        String answer = "";
        s=s.toLowerCase();
        String []c = s.split(" ",-1);
        for(int i=0;i<c.length;i++){
            for(int j=0;j<c[i].length();j++){
                if(j%2==0){
                    char[] array= c[i].toCharArray();
					array[j]=Character.toUpperCase(array[j]);
                    c[i]=new String(array);
                }
            }
        }
        answer=c[0];
            for(int i=1;i<c.length;i++){
                answer+=" "+c[i];
            }
        return answer;
    }
}
