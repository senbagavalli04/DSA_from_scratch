#User function Template for python3
class Solution:
    def factorial (self, n):
        f = 1
        for i in range(1,n+1):
            f*=i
        return f
        
