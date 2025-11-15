def is_valid(isbn):
    isbn = isbn.replace('-', '')
    if len(isbn) != 10:
        return False
    if 'X' in isbn and isbn[len(isbn) - 1] != 'X':
        return False

    total = 0
    for i in range (10):
        try:
            num = isbn[i]
            if num == 'X': num = '10'
            total += int(num) * (10 - i)
        except ValueError:
            return False
    return total % 11 == 0
