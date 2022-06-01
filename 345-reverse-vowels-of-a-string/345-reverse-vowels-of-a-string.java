class Solution {
    public String reverseVowels(String s) {
        int l=0;
        int r=s.length()-1;
        char[] a = s.toCharArray();
        Set<Character> v=new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
        while(l<r)
        {
            if((!v.contains(a[l])) && (!v.contains(a[r])) ){
                ++l;
                --r;
            }
            else if(!v.contains(a[l])){
                ++l;
            }
            else if(!v.contains(a[r])){
                --r;
            }
            else {
                char t=a[r];
                a[r]=a[l];
                a[l]=t;
                ++l;
                --r;
                
            }
                  
    }
        return new String(a);
}
               }