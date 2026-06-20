from collections import defaultdict
import heapq

class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        freqMap = defaultdict(int)

        for num in nums:
            freqMap[num] += 1
        
        minHeap = []

        for num, freq in freqMap.items():
            heapq.heappush(minHeap, (freq, num))
            if len(minHeap) > k:
                heapq.heappop(minHeap)
        
        result = []
        for i in range(k):
            result.append(heapq.heappop(minHeap)[1])
            
        return result