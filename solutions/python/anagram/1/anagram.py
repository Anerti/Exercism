def is_equal(word1, word2):
    return sorted(list(word1.lower())) == sorted(list(word2.lower()))

def find_anagrams(word, candidates):
    return [ candidate for candidate in candidates
             if candidate.lower() != word.lower()
             and is_equal(word, candidate) ]
