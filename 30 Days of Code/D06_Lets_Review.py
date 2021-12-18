# Enter your code here. Read input from STDIN. Print output to STDOUT

n = int(input().strip())
temp = []
for i in range(0,n):
    temp.append(input().strip())

for i in range(0,n):
    
    for j in range(0,len(temp[i]),2):
        print(temp[i][j],end='')
        
    print(end=' ')
    
    for j in range(1,len(temp[i]),2):
        print(temp[i][j],end='')
        
    print()