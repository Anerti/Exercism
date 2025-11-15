def is_valid(isbn):
    isbn = isbn.replace('-', '')
    if len(isbn) != 10:
        return False

    total = 0
    if isbn.endswith('X'):
        isbn = isbn[:isbn.index('X')]
        total = 10

    for index, number in enumerate(isbn):
        if number.isdigit():
            total += int(number) * (10 - index)
        else:
            return False
        
    return total % 11 == 0