class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        sCharCount = {}
        tCharCount = {}

        for char in s:
            sCharCount[char] = sCharCount.get(char, 0) + 1
        
        for char in t:
            tCharCount[char] = tCharCount.get(char, 0) + 1
        
        return sCharCount == tCharCount
