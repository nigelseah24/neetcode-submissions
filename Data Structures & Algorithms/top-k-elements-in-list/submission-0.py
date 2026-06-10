import heapq
from collections import defaultdict


class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        # store all values and count in dictionary
        numCount = defaultdict(int)
        for num in nums:
            numCount[num] += 1
        # return top K with heapq
        return heapq.nlargest(k, numCount, key=numCount.get)