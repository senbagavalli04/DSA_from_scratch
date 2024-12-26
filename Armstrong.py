def checkArmstrong(n):
    cpy = n
    copy =n
    cnt = 0
    while(cpy!=0):
        cnt+=1
        cpy//=10
  #print(cnt)
    s=0
    while(copy!=0):
        rem= copy %10
        s+= rem ** cnt
        #print(s)
        copy//=10
    if s==n:
        return True
    else:
        return False



    
