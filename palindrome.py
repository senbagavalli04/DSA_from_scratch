n=int(input())  
cpy=n
rev = 0
while(cpy!=0):
    rev = (rev * 10) + (cpy%10)
    cpy//=10
if n == rev:
    print("true")
else:
    print("false")
