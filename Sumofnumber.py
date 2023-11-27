sum = 0
count = 0
number = 1

while number != 0:
    number = int(input("Enter an integer number (0 to stop): "))
    sum += number
    count += 1

if count == 1:
    print("You entered only 0. No numbers were entered.")
else:
    average = sum / (count - 1)
    print(f"The sum of the {count - 1} numbers is {sum}.")
    print(f"The average of the {count - 1} numbers is {average:.2f}.")
