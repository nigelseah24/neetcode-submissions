class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        if not strs:
            return strs
        
        if strs == [""]:
            return [[""]]

        if len(strs) == 1:
            return [strs]

        finalList = []
        
        dict = {}

        for str in strs:
            arrayValue = []
            # 1. store str in dict:
            # {
            #     "act": ["act", "cat"],
            #     "opst": ["pots", "tops", "stop"],
            #     "aht": ["hat"]
            # }
            anagram = "".join(sorted(str))
            arrayValue = dict.get(anagram, [])
            arrayValue.append(str)
            dict[anagram] = arrayValue

        for value in dict.values():
            finalList.append(value)

        return finalList





