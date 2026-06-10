class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False
        
        firstDict, secondDict = {}, {}

        for i in range (len(s)):
            firstDict[s[i]] = firstDict.get(s[i], 0) + 1
            secondDict[t[i]] = secondDict.get(t[i], 0) + 1

        print(firstDict, secondDict)
       
        return firstDict == secondDict