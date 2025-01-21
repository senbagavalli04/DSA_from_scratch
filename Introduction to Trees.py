#User function Template for python3
# CODE LINK: https://www.geeksforgeeks.org/problems/introduction-to-trees/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=introduction-to-trees
class Solution:
    def countNodes(self, i):
        return 2**(i-1)

#{ 
 # Driver Code Starts.
if __name__ == '__main__': 
    t = int(input ())
    for _ in range (t):
        i = int(input())
        ob = Solution()
        res = ob.countNodes(i)
        print(res)
        print("~")
# } Driver Code Ends
