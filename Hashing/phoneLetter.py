class Solution:
    def letterCombinations(self, digits: str) -> List[str]:
        d={2:"abc",3:"def",4:"ghi",5:"jkl",6:"mno",7:"pqrs",8:"tuv",9:"wxyz"}
        ans=[]
        def f(l,s):
            if len(l)==len(digits):
                ans.append("".join(l))
                return
            if s>len(digits):
                return 
            for i in range(len(d[int(digits[s])])):
                l.append(d[int(digits[s])][i])
                f(l,s+1)
                l.pop()
        f([],0)
        return ans
