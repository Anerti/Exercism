def is_valid(isbn):
    isbn = isbn.replace('-', '')
    if len(isbn) != 10:
        return False

    if isbn.endswith('X') or 'X' not in isbn:
        total = 0
        for index, number in enumerate(isbn):
            try:
                if number == 'X':
                    number = '10'
                total += int(number) * (10 - index)
            except ValueError:
                return False
        return total % 11 == 0
    return False