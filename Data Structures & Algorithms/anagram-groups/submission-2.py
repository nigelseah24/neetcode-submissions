from collections import defaultdict

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        seen = {}
        result = []

        for str in strs:
            sortedStr = ''.join(sorted(str))
            currentList = seen.get(sortedStr, [])
            currentList.append(str)
            seen[sortedStr] = currentList

        for value in seen.values():
            result.append(value)
        
        return result