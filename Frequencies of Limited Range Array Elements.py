#CODE LINK : https://www.geeksforgeeks.org/problems/frequency-of-array-elements-1587115620/0
#The aim is to find the frequency of given elements in a array

def frequencyCount(self, arr):
        n = len(arr)
        frq = [0] * n
        for num in arr:
            if 1 <= num <= n:
                frq[num - 1] += 1
        
        return frq
