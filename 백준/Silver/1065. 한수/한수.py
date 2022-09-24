n = int(input())
count = 0
for i in range(1,n+1):
    if(i<100):
        count+=1
    else:
        num = str(i)
        check = 0
        for j in range(0,len(num)-2):
            if(int(num[j+1])-int(num[j])==int(num[j+2])-int(num[j+1])):
                check+=1
            else:
                break 
        if(check == len(num)-2):
            count+=1
print(count)
    
    
