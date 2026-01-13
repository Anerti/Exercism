def aliquot_sum(number):
    return sum(i for i in range(1, number) if number % i == 0)


def classify(number):
    if number < 1:
        raise ValueError("Classification is only possible for positive integers.")
    
    total = aliquot_sum(number)
    if total > number:
        return "abundant"
    if total < number:
        return "deficient"
    return "perfect"
