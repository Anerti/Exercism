def is_isogram(string):
    data = ''.join(c.lower() for c in string if c.isalpha())
    return len(set(data)) == len(data)
    
