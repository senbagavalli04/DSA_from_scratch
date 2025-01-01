#CODE LINK : https://leetcode.com/problems/binary-search/
#Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.
#You must write an algorithm with O(log n) runtime complexity.

class Solution(object):
    def search(self, nums, target):
        l=0
        r=len(nums)-1
        while(l<=r):
            m = (l+r)//2
            if nums[m] == target:
                return m
            elif nums[m]>target:
                r = m-1
            else:
                l = m+1
        return -1
        
