def product(*args):
    result = 1
    for num in args:
        result *= num
    return result


print("Product of 2, 3, and 4:", product(2, 3, 4))
print("Product of 5, 6, 7, and 8:", product(5, 6, 7, 8))
print("Product of 10:", product(10))
