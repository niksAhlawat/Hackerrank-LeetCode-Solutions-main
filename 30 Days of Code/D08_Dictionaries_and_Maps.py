# Enter your code here. Read input from STDIN. Print output to STDOUT

n = int(input())

phonebook = {}

for i in range(n):
    name, phone = tuple(map(str, input().rstrip().split()))
    phonebook[name] = phone
    
while True:
    try:
        key = input().rstrip()
        if key in phonebook:
            print(key+"="+phonebook[key])
        else:
            print("Not found")
    except EOFError:
        break

    
