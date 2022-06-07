class Solution {
    public int findKthLargest(int[] nums, int k) {
PriorityQueue<Integer> heap = new PriorityQueue<Integer>();      // create a min heap
        
        // keep k largest elements in the heap
        for (int n: nums) {
          heap.add(n);
          if (heap.size() > k) heap.poll();     // expel the smaller numbers from the minHeap
        }
        System.out.println(heap);
        return heap.peek();
    }
}