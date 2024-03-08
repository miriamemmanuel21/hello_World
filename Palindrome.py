def is_palindrome(number):
    temp = number
    reverse_num = 0
    while number > 0:
        digit = number % 10
        reverse_num = reverse_num * 10 + digit
        number = number // 10
    return temp == reverse_num

try:
    user_input = int(input("Enter a five-digit integer: "))
    if 10000 <= user_input < 100000:
        if is_palindrome(user_input):
            print("It's a palindrome!")
        else:
            print("It's not a palindrome.")
    else:
        print("Please enter a valid five-digit integer.")
except ValueError:
    print("Invalid input. Please enter a valid integer.")
