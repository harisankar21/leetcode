class Solution {
    public List<String> generateParenthesis(int n) {
        
        List<String> ls=new ArrayList<>();
        backtrack(ls,"",0,0,n);
        return ls;
    }
    void backtrack(List<String> ls,String s,int open,int close,int max){
        
        if(s.length()==(max*2)){
            ls.add(s);
        }
        if(open<max){
            backtrack(ls,s+"(",open+1,close,max);
        }
        if(close<open){
            backtrack(ls,s+")",open,close+1,max);
        }
    }
}