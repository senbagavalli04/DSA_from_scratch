class Solution:
    def printTriangle(self, N):
        for i in range(N):
            for j in range(N):
                print("*",end=" ")
                if i==j:
                    break
            print("")
