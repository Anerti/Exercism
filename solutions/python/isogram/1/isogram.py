import re


def is_isogram(string):
    data = list(''.join(re.findall('[a-zA-Z]*', string)).lower())
    return len(data) == len(set(data))
