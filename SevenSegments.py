def seven_segment_display(digit):
    representations = {
        '0': ('###', '# #', '# #', '# #', '###'),
        '1': ('  #', '  #', '  #', '  #', '  #'),
        '2': ('###', '  #', '###', '#  ', '###'),
        '3': ('###', '  #', '###', '  #', '###'),
        '4': ('# #', '# #', '###', '  #', '  #'),
        '5': ('###', '#  ', '###', '  #', '###'),
        '6': ('###', '#  ', '###', '# #', '###'),
        '7': ('###', '  #', '  #', '  #', '  #'),
        '8': ('###', '# #', '###', '# #', '###'),
        '9': ('###', '# #', '###', '  #', '###')
    }

    digit_str = str(digit)

    display = ''

    for char in digit_str:
        if char in representations:
            display += '\n'.join(representations[char]) + '  '

    return display

try:
    binary_input = input("Enter a number in binary: ")
    decimal_input = int(binary_input, 2)
    print(seven_segment_display(decimal_input))
except ValueError:
    print("Invalid input. Please enter a valid positive binary integer.")

