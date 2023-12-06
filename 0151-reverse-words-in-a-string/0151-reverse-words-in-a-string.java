class Solution {
    public String reverseWords(String s) {
        String[] sl=s.split(" ");
        System.out.println(sl.length);
        String r=" ";
        int n=sl.length-1;
        for(int i=0;i<sl.length;++i){
            if(!sl[n-i].isEmpty()){
            r=r+sl[n-i]+" ";
            }
        }
        r=r.trim();
        return r;
    }
}