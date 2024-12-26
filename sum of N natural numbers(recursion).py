def func (n,sum):
    if (n==0):
        return sum
    return func(n-1,sum+n)
n = int(input())
val = func(n,0)
print(val)
