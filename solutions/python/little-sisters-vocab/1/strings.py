"""Functions for creating, transforming, and adding prefixes to strings."""
import re

def add_prefix_un(word):
    return f'un{word}'


def make_word_groups(vocab_words):
    return f' :: {vocab_words[0]}'.join(vocab_words)


def remove_suffix_ness(word):
    word = word.split('ness')[0]
    if word.endswith('i'):
        return f"{word[0:word.index('i')]}y"
    return word


def adjective_to_verb(sentence, index):
    return f"{''.join(re.findall('[a-zA-Z]', sentence.split(' ')[index]))}en"
