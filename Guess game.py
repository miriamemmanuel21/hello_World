import random

def guess_number():
    number = random.randint(0, 10)
    for i in range(3):
        guess = int(input("Guess a number between 0 and 10: "))
        if guess == number:
            print("You guessed the number!")
            return
        else:
            print("Try again.")
    print("You didn't guess the number. It was", number)

guess_number()