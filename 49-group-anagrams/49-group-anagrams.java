class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
               List<List<String>>  anagrams = new ArrayList<>();
 List<String> words = Arrays.asList(strs); 
        // base case
        if (words == null) {
            return anagrams;
        }
 
        //sort each word on the list
        // List<String> list = words.stream()
        //         .map(s -> Stream.of(s.split("")).sorted()
        //                 .collect(Collectors.joining()))
        //         .collect(Collectors.toList());
        List<String> list= new ArrayList<>();
        for(String tmp:words){
            char[] tmpArray=tmp.toCharArray();
            Arrays.sort(tmpArray);
            list.add(new String(tmpArray));
                
        }
 
        // construct a map where the key is each sorted word,
        // and value is a list of indices where it is present
        Map<String, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < list.size(); i++)
        {
            map.putIfAbsent(list.get(i), new ArrayList<>());
            map.get(list.get(i)).add(i);
        }
 
        // traverse the map and read indices for each sorted key.
        // The anagrams are present in the actual list at those indices
        for (var entry: map.entrySet())
        {
            List<String> collection = entry.getValue().stream()
                    .map(i -> words.get(i))
                    .collect(Collectors.toList());
            if (collection.size() >=1) {
                anagrams.add(collection);
            }
        }
 
        return anagrams;
        
    }
}