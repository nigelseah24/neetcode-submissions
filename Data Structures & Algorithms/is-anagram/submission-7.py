class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        sDict = {}
        tDict = {}

        if len(s) != len(t):
            return False
        
        for i, char in enumerate(s):
            sDict[char] = sDict.get(char, 0) + 1
        
        for j, char in enumerate(t):
            tDict[char] = tDict.get(char, 0) + 1

        return sDict == tDict
