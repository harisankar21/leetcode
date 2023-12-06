class Solution {
    public int compress(char[] chars) {
        // Map<Character,Integer> cMap=new TreeMap<>();
        
        // for(int i=0;i<chars.length;++i){
        //     if(cMap.get(chars[i])!=null){
        //         cMap.put(chars[i],cMap.get(chars[i])+1);
        //     }
        //     else{
        //          cMap.put(chars[i],1);
        //     }
        // }
        // int k=0;
        //    if(cMap.keySet().size()==1){
        //     return 1;
        // }
        // System.out.println(cMap);
        // for(Character c:cMap.keySet()){
        //   chars[k]=c;
        //   ++k;
        //   System.out.println(k);
        //   //chars[k+1]=Character.forDigit(cMap.get(c), 10);
        // for(char ch : Integer.toString(cMap.get(c)).toCharArray()) {
        //     System.out.println("ch"+ch);
        //                 chars[k] = ch;
        //                 k++;
        //             }
          
        // }
     
    
        //     return cMap.keySet().size()*2;
    
        // // for(Character c:cMap.keySet()){
        // //   k=k+cMap.get(c);
        // // }
        // // k=k+
        int index = 0;
        int count = 0;

        for(int i=0; i<chars.length; i++) {
            count++;

            if(i+1 == chars.length || chars[i]!= chars[i+1]) {
                chars[index] = chars[i];
                index++;
                if(count != 1) {
                    for(char ch : Integer.toString(count).toCharArray()) {
                        chars[index] = ch;
                        index++;
                    }
                }
                count = 0;
            }
        }
        return index;

    }
}