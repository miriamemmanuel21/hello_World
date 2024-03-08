contacts = []

while True:
    name = input(" Kindly enter  a new  name: ")
    number = input(" Kindly enter a  new number: ")
    contacts.append((name, number))
    choice = input("Do you want to add another contact? (yes/no): ")
    if choice.lower() == "no":
        break

print("Contacts:")
for name, number in contacts:
    print(f"{name}: {number}")
