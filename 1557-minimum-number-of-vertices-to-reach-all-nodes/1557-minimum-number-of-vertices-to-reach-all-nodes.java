class Solution {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
                Set<Integer> set = new HashSet<>();
        List<Integer> result = new ArrayList<>();
        
        for(List<Integer> edge : edges) {
            set.add(edge.get(1));
        }
        
        for(int i = 0; i < n; i++) {
            if(!set.contains(i)) {
                result.add(i);
            }
        }
       
        return result;
        
    }
}