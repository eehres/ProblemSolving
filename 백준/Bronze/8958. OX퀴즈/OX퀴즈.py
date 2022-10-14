n = int(input())

for i in range(n):
    sum = 0
    point = 0
    ox = input()
    for i in ox:
        if i == 'O':
            point+=1
            sum+=point
        else:
            point=0
    print(sum)
        

    
    