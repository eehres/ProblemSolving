import math
T = int(input())
for i in range(T):
    x1, y1, r1, x2, y2, r2 = map(int, input().split())
    a = math.sqrt((y2-y1)**2+(x2-x1)**2)
    if(a == 0 and r1==r2):
        print("-1")
    elif abs(r1-r2) == a or r1 + r2 == a:
        print(1)
    elif abs(r1-r2) < a < (r1+r2) :
        print(2)
    else:
        print("0")