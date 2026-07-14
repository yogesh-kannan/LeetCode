class Solution:
    def sortColors(self, nums: List[int]) -> None:
        def moving_digits(i,j,target):
            for num in nums:
                if num==target:
                    j+=1
                elif num<target and j-i>0:
                    nums[i+1:j+1],nums[i]=nums[i:j],num
                    i,j=i+1,j+1
                else:
                    i,j=i+1,j+1
        moving_digits(0,0,2)
        moving_digits(0,0,1)
