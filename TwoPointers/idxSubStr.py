class Solution:
    def strStr(self, haystack: str, needle: str) -> int:
        j=-1
        if haystack==needle:
            return 0
        for i in range(0,len(haystack)-len(needle)+1):
            if haystack[i:len(needle)+i]==needle:
                j=i
                break
        return j
