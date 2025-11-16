def is_valid(isbn):
    isbn = list(isbn.replace('-', ''))
    if len(isbn) != 10:
        return False

    if isbn[len(isbn) - 1] == 'X':
        isbn[len(isbn) - 1] = '10'

    for index, number in enumerate(isbn):
        if number.isdigit():
            isbn[index] = int(number) * (10 - index)
        else:
            return False

    return sum(isbn) % 11 == 0