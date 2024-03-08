a = float(input("Enter the first number: "))
b = float(input("Enter the second number: "))
c = float(input("Enter the third number: "))

if a <= b and a <= c:
    smallest = a
    if b <= c:
        middle = b
        largest = c
    else:
        middle = c
        largest = b
elif b <= a and b <= c:
    smallest = b
    if a <= c:
        middle = a
        largest = c
    else:
        middle = c
        largest = a
else:
    smallest = c
    if a <= b:
        middle = a
        largest = b
    else:
        middle = b
        largest = a

print(f"The numbers in increasing order are: {smallest}, {middle}, {largest}")
