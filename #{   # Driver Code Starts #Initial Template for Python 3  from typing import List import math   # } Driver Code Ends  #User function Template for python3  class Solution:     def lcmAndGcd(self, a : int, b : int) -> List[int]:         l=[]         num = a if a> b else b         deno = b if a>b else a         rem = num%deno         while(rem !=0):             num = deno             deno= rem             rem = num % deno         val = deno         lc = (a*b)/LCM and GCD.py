#{ 
 # Driver Code Starts
#Initial Template for Python 3

from typing import List
import math


# } Driver Code Ends

#User function Template for python3

class Solution:
    def lcmAndGcd(self, a : int, b : int) -> List[int]:
        l=[]
        num = a if a> b else b
        deno = b if a>b else a
        rem = num%deno
        while(rem !=0):
            num = deno
            deno= rem
            rem = num % deno
        val = deno
        lc = (a*b)//val
        l.append(lc)
        l.append(val)
        return l
        

#{ 
 # Driver Code Starts.


if __name__=="__main__":
    t = int(input())
    for _ in range(t):
        a = int(input())
        b = int(input())
        obj = Solution()
        res = obj.lcmAndGcd(a, b)
        print(f"{res[0]} {res[1]}")
        print("~")

# } Driver Code Ends
