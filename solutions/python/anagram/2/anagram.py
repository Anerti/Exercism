def is_equal(word1, word2):
    return word1 == sorted(list(word2.lower()))

def find_anagrams(word, candidates):
    sorted_word = sorted(list(word.lower()))
    return [ candidate for candidate in candidates
             if candidate.lower() != word.lower()
             and is_equal(sorted_word, candidate) ]