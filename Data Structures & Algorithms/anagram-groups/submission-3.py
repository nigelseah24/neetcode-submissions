from collections import defaultdict

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        seen = defaultdict(list)
        result = []

        for str in strs:
            sortedStr = ''.join(sorted(str))
            seen[sortedStr].append(str)


        for value in seen.values():
            result.append(value)
        
        return result