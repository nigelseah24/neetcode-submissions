class Solution:
    # 5#Hello5#World

    # n
    def encode(self, strs: List[str]) -> str:
        # ["Hello", "World"] -> 5#Hello5#World

        strArr = []
        for s in strs:
            strArr.append(str(len(s)))
            strArr.append('#')
            strArr.append(s)
        return "".join(strArr)

    def decode(self, s: str) -> List[str]:
        # 5#Hello5#World -> ["Hello", "World"]
        res = []
        i = 0
        while i < len(s):
            j = i
            while s[j] != '#':
                j += 1
            length = int(s[i:j])
            i = j + 1
            j = i + length
            word = s[i:j]
            res.append(word)
            i = j
        return res


