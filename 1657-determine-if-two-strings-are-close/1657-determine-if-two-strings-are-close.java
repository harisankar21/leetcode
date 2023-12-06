class Solution {
    public boolean closeStrings(String word1, String word2) {
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];
        if(word1.length()!=word2.length()){
            return false;
        }
        for(int i=0;i<word1.length();i++) freq1[word1.charAt(i)-'a']++;
        for(int i=0;i<word2.length();i++) freq2[word2.charAt(i)-'a']++;

        if(Arrays.equals(freq2, freq1)){
            return true;
        }
  for(int i=0;i<26;i++){
            if((freq1[i]==0 && freq2[i]!=0) || (freq2[i]==0 && freq1[i]!=0)){
                return false;
            }
        }
                                Arrays.sort(freq1);
        Arrays.sort(freq2);
        
        // If arrays are equal, it means that we have the same number of characters, so we will return true.
        if(Arrays.equals(freq2, freq1)) {return true;}
        Map<Character,Integer> cMap=new HashMap<>();
        // for(Character c: word1.toCharArray()){
        //     cMap.put(c,cMap.getOrDefault(c,0)+1);
        // }
        // for(Character c:word2.toCharArray()){
        //     if(cMap.get(c)==null){
        //         return false;
        //     }
        //     else if(cMap.get(c)==1){
        //        cMap.remove(c);
        //     }else{
        //         cMap.put(c,cMap.get(c)-1);
        //     }
        // }
        // return true;
        return false;
    }
}