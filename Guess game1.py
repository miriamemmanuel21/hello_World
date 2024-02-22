import random

answer = 42

guess = int(input("guess a number: "))

correct_responses = ["Very good!", "Nice work!", "Keep up the good work!"]
incorrect_responses = ["No. Please try again.", "Wrong. Try once more.", "No. Keep trying."]

number = random.randint(1, 3)

correct_response = correct_responses[number - 1]
incorrect_response = incorrect_responses[number - 1]

if guess == answer:
    print(correct_response)