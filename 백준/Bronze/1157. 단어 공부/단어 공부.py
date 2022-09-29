s = input().upper()
count_list = []
s_list = list(set(s))
for i in s_list:
    count_list.append(s.count(i))
if count_list.count(max(count_list))>1:
    print("?")
else:
    print(s_list[count_list.index(max(count_list))])