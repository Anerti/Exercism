def is_valid(isbn):
    isbn = list(isbn.replace('-', ''))
    if len(isbn) != 10:
        return False

    if isbn[-1] == 'X':
        isbn[-1] = '10'

    if all(number.isdigit() for number in isbn):
        return sum(int(number) * (10 - index) for index, number in enumerate(isbn)) % 11 == 0
    return False