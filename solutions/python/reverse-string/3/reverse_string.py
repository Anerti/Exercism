def reverse(text):
    return ''.join([text[index] for index in range(len(text) - 1, -1, -1)])


print(reverse("hello world"))
