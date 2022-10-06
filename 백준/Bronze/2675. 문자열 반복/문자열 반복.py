n = int(input())
for i in range(0,n):
    num, s = input().split()
    text = ''
    for j in s:
        text += j*int(num)
    print(text)