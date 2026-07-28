class Solution:
    def isPalindrome(self, s: str) -> bool:
        s=s.lower()
        s=list(s)
        s1=[]
        for i in range(0,len(s)):
            if s[i].isalnum():
                s1.append(s[i])
        s="".join(s1)
        return s==s[::-1]

            
