from collections import defaultdict

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        seen = defaultdict(list)

        for str in strs:
            sortedStr = ''.join(sorted(str))
            seen[sortedStr].append(str)
        
        return list(seen.values())