#CODE LINK : https://leetcode.com/problems/reverse-words-in-a-string/

class Solution(object):
    def reverseWords(self, s):
        val = ''
        res = ''.join(char if char not in string.whitespace else ' ' for char in s).split()
        #print(res)
        l = 0
        r = len(res)-1
        while(l<r):
            temp = res[l]
            res[l] = res[r]
            res[r] = temp 
            l+=1
            r-=1
        #print(res)
        n = len(res)
        for i in range(n-1):
            val+=(res[i]+' ') 
        val+=res[n-1]
        return val


